import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int T, x, y, d;
    static int[][] map;
    static int[] dx = {0, 0, -1}; //우좌상
    static int[] dy = {1, -1, 0};
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = 10;
        int n = 100;
        map = new int[n + 2][n + 2];

        //벽치기
        for (int i = 0; i < n + 2; i++) {
            map[i][0] = map[i][n+1]
            = map[0][i] = map[n+1][i] = -1;
        }

        for (int t = 1; t <= tc; t++) {
            T = Integer.parseInt(br.readLine());

            //입력
            for (int i = 1; i <= n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    if (map[i][j] == 2) { // 도착점 저장
                        x = i;
                        y = j;
                    }
                }
            }
            
            ladder(x, y);
        }
    }

    private static void ladder(int x, int y) {
        if (x == 1) {
            System.out.print("#" + T + " ");
            System.out.println(y - 1);
            return;
        }

        map[x][y] = -2;
        for (int d = 0; d < 3; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (map[nx][ny] != 1) continue;
            ladder(nx, ny);
            return;
        }
    }
}