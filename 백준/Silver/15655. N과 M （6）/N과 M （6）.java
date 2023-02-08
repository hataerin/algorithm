import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] elements, numbers;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        elements = new int[N];
        numbers = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++) {
            elements[n] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(elements);

        combination(0, 0);
        System.out.println(sb);
    }

    //중복X 조합
    private static void combination(int cnt, int start) {
        //기저조건
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                sb.append(numbers[i] + " ");
            }
            sb.append("\n");
            return;
        }

        //유도파트
        for (int i = start; i < N; i++) {
            numbers[cnt] = elements[i];
            combination(cnt + 1, i + 1);
        }
    }
}
