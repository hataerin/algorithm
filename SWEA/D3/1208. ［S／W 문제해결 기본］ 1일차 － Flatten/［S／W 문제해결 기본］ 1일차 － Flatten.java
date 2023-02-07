import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    static int T = 10;
    static int Dump;
    static int[] box = new int[100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1; t <= T; t++) {
            Dump = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            //입력
            for (int i = 0; i < 100; i++) {
                box[i] = Integer.parseInt(st.nextToken());
            }

            //평탄화
            for (int d = 0; d < Dump; d++) {
                Arrays.sort(box);
                box[0] += 1;
                box[99] -= 1;
            }

            //출력
            Arrays.sort(box);
            int result = box[99] - box[0];
            System.out.println("#" + t + " " + result);
        }
    }
}
