import java.util.Scanner;

public class Main {
    static int N, cnt, start, end, sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        cnt = 1; start = 1; end = 1; sum = 1;
        while (end != N) {
            if (sum == N) {
                cnt++;
                end++;
                sum += end;
            } else if (sum > N) {
                sum -= start;
                start++;
            } else {
                end++;
                sum += end;
            }
        }
        System.out.println(cnt);
    }
}