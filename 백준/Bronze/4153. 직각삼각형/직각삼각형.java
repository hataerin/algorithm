import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];
        while (true) {

            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();

            if (arr[0]==0 && arr[1]==0 && arr[2]==0) System.exit(0); //종료조건

            Arrays.sort(arr);

            int a = arr[0] * arr[0];
            int b = arr[1] * arr[1];
            int c = arr[2] * arr[2];

            if (a + b == c) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}