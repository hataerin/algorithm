import java.util.Scanner;

public class Main {

    static int N, M;
    static int[] numbers;
    static boolean[] isSelected;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        numbers = new int[M];
        isSelected = new boolean[N + 1];

        permutation(0);


    }

    //중복X 순열
    private static void permutation(int cnt) {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
            return;
        }

        //기저조건
        for (int i = 1; i <= N; i++) {
            if (isSelected[i]) continue;
            numbers[cnt] = i;
            isSelected[i] = true;
            permutation(cnt + 1);
            isSelected[i] = false;
        }
    }
}
