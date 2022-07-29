import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int pow = 2;

        if (N == 1) {
            System.out.print("1");
            System.exit(0);
        }


        while (pow < N) {
            pow *= 2;
        }

        if (pow == N) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }

    }
}