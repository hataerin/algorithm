import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] numbers;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        numbers = new int[M];

        permutation(0);
        System.out.println(sb);
    }

    //중복O 순열
    private static void permutation(int cnt) {
        //기저조건
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                sb.append(numbers[i] + " ");
            }
            sb.append("\n");
            return;
        }

        //유도파트
        for (int i = 1; i <= N; i++) {
            numbers[cnt] = i;
            permutation(cnt + 1);
        }
    }
}
