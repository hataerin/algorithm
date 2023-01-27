import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, max;
    static int[] element, result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        element = new int[N];
        result = new int[3];

        st = new StringTokenizer(br.readLine(), " ");
        for (int n = 0; n < N; n++) {
            element[n] = Integer.parseInt(st.nextToken());
        }

        combination(0, 0);
        System.out.println(max);
    }

    //중복X 조합
    private static void combination(int cnt, int start) {
        //기저조건
        if (cnt == 3) {
            maximum(result);
            return;
        }
        //유도파트
        for (int i = start; i < N; i++) {
            result[cnt] = element[i];
            combination(cnt+1, i+1);
        }
    }

    private static void maximum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (M >= sum && sum > max) max = sum;
    }
}
