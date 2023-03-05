import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, x1, x2, y1, y2, res;
    static int[][] sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        sum = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) { //합배열 초기화
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                sum[i][j] = sum[i][j - 1] + Integer.parseInt(st.nextToken());
            }
        }

        for (int m = 1; m <= M; m++) {
            res = 0;
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            for (int i = x1; i <= x2; i++) {
                res = res + (sum[i][y2] - sum[i][y1-1]);
            }
            sb.append(res + "\n");
        }
        System.out.println(sb);
    }
}