import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int T;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            Stack<String> stack = new Stack<>();
            String str = sc.next();
            String arr[] = str.split("");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("(")) {
                    stack.push(arr[i]);
                } else if (stack.isEmpty()) {
                    stack.push(arr[i]);
                    break;
                } else {
                    stack.pop();
                }
            }
            System.out.println(stack.isEmpty()?"YES":"NO");
        }
    }
}
