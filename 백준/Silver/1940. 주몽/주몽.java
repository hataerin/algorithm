import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N, M, cnt, i, j;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        cnt = 0;
        i = 0; //arr[0] : 최솟값
        j = N - 1; //arr[N-1] : 최댓값
        while (i < j) {
            if (arr[i] + arr[j] < M) i++;
            else if (arr[i] + arr[j] > M) j--;
            else {
                cnt++;
                i++;
                j--;
            }
        }
        System.out.println(cnt);
    }
}