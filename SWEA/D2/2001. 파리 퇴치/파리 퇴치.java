import java.util.Scanner;

public class Solution {
    static int T, N, M, sum, max;
    static int[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            N = sc.nextInt();
            M = sc.nextInt();
            map = new int[N][N];

            //입력
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            //구현
            max = -1;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sum = 0;
                    trap(i, j);
                }
            }

            //출력
            System.out.println("#" + t + " " + max);
        }
    }

    private static void trap(int x, int y) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (x+i < 0 || x+i >= N || y+j < 0 || y+j >= N) continue;
                sum += map[x + i][y + j];
            }
        }
        if (max < sum) max = sum;
    }
}
