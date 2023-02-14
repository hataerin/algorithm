import java.util.Scanner;

public class Solution {
    static int T, N, sum, start, end;
    static int[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            N = sc.nextInt();
            map = new int[N][N];

            //입력
            for (int i = 0; i < N; i++) {
                String str = sc.next();
                String[] strArr = str.split("");
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(strArr[j]);
                }
            }

            //구현
            sum = 0;
            start = N / 2;
            end = N / 2;
            for (int i = 0; i < N; i++) {
                for (int j = start; j <= end; j++) {
                    sum += map[i][j];
                }
                if (i < N / 2) {
                    start--;
                    end++;
                } else {
                    start++;
                    end--;
                }
            }

            //출력
            System.out.println("#" + t + " " + sum);
        }
    }
}
