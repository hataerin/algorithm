import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, K, max, sum, start, end;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        max = 0;
        sum = 0;
        for (int i = 0; i < N + K; i++) {
            if (i < K) {
                sum += arr[i];
            }
            else {
                sum = sum - arr[i - K] + arr[i % N];
            }
            if (max < sum) {
                max = sum;
            }
        }

        System.out.println(max);

    }
}
