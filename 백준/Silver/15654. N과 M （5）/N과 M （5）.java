import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] elements, numbers;
    static boolean[] isSelected;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        elements = new int[N];
        isSelected = new boolean[N];
        numbers = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++) {
            elements[n] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(elements);

        permutation(0);
        System.out.println(sb);
    }

    //중복X 순열
    private static void permutation(int cnt) {
        //기저조건
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                sb.append(numbers[i] + " ");
            }
            sb.append("\n");
            return;
        }

        //유도파트
        for (int i = 0; i < N; i++) {
            if (isSelected[i]) continue;
            numbers[cnt] = elements[i];
            isSelected[i] = true;
            permutation(cnt + 1);
            isSelected[i] = false;
        }
    }
}
