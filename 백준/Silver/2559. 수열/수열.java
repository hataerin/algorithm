import java.util.Scanner;

public class Main {
    static int N, K, max, sum;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        arr = new int[N];

        max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N - K + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + K; j++) {
                sum = sum + arr[j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
