import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {

            String str = sc.next();
            String[] arrStr = str.split("");
            int[] arrInt = Arrays.asList(arrStr).stream().mapToInt(Integer::parseInt).toArray();

            int set = 0;
            int cnt = 0;
            for (int i = 0; i < arrInt.length; i++) {
                if (arrInt[i] != set) {
                    cnt++;
                    set = arrInt[i];
                }
            }
            System.out.println("#"+ t + " " + cnt);
        }
    }

}
