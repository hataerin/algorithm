import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static int N, M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt());
        }
        M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            if (set.contains(sc.nextInt()))
                System.out.println(1);
            else System.out.println(0);
        }
        sc.close();
    }
}