import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int T, M, N, K, cnt;
    static int[][] map;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    private static void dfs(int x, int y) {
        map[x][y] = 0;

        try {
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (map[nx][ny] == 0) continue;
                dfs(nx, ny);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[M + 2][N + 2];
            for (int k = 0; k < K; k++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()) + 1;
                int y = Integer.parseInt(st.nextToken()) + 1;
                map[x][y] = 1;
            }

            cnt = 0;
            for (int m = 1; m <= M; m++) {
                for (int n = 1; n <= N; n++) {
                    if (map[m][n] == 0) continue;
                    dfs(m, n);
                    cnt += 1;
                }
            }
            System.out.println(cnt);
        }
    }
}
