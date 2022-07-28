import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int N, M;
    static int numbers[];
    static boolean isSelected[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        numbers = new int[M];

        combination(0, 1);
    }

    static void combination(int cnt, int start) {
        if (cnt == M) {
            print();
            return;
        }

        for (int i = start; i <= N; i++) {
            numbers[cnt] = i;
            combination(cnt + 1, i+1);
        }
    }

    static void print() {
        for (int i = 0; i < M; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
