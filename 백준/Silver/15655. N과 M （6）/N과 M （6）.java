import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int N, M;
    static int[] element, numbers;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        element = new int[N];
        numbers = new int[M];

        for (int i = 0; i < N; i++) {
            element[i] = sc.nextInt();
        }
        Arrays.sort(element);

        combination(0, 0);
        System.out.println(sb);
    }

    //중복X 조합
    private static void combination(int cnt, int start) {
        //기저조건
        if (cnt == M) {
            print(numbers);
            return;
        }
        //유도파트
        for (int i = start; i < N; i++) {
            numbers[cnt] = element[i];
            combination(cnt+1, i+1);
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        sb.append("\n");
    }
}
