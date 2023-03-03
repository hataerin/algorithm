import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, i, j, res;
    static int[] arr, sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        sum = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++) {
            arr[n] = Integer.parseInt(st.nextToken()); //배열 초기화
            if (n == 0) {
                sum[n] = arr[n];
                continue;
            }
            sum[n] = sum[n - 1] + arr[n]; //합배열 초기화
        }

        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());

            if (i == 1) {
                res = sum[j-1];
            } else {
                res = sum[j - 1] - sum[i - 2];
            }
            System.out.println(res);
        }
    }
}
