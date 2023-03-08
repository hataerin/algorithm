import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int N;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        for (int n = 0; n < N; n++) {
            arr[n] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int tmp = arr[i];
            if (tmp >= num) {
                while (tmp >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int n = stack.pop();
                if (n > tmp) {
                    System.out.println("NO");
                    System.exit(0);
                } else {
                    sb.append("-\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
