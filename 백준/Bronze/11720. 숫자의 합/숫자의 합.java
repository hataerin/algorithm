import java.util.Scanner;

public class Main {
    static int N, result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = Integer.parseInt(sc.next());
        String str = sc.next();
        String[] strArr = str.split("");

        for (int n = 0; n < N; n++) {
            result += Integer.parseInt(strArr[n]);
        }

        System.out.println(result);
    }
}
