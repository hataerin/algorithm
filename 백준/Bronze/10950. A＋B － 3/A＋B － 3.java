import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) { //테케만큼 반복
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }
    }
}