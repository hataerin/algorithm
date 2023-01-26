import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] numbers; //결과값 저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        numbers = new int[M];

        permutation(0);
        System.out.println(sb);
    }

    //중복O 순열
    private static void permutation(int cnt) {
        //기저조건
        if (cnt == M) {
            print(numbers);
            return;
        }
        //유도파트
        for (int i = 1; i <= N; i++) {
            numbers[cnt] = i;
            permutation(cnt+1);
        }
    }


    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        sb.append("\n");
    }
}
