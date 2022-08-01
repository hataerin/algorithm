import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int min = 10000000, max = -10000000;

        for (int n = 0; n < N; n++) {
            int num = sc.nextInt();

            if(num > max) max = num; //최댓값 갱신
            if(num < min) min = num; //최솟값 갱신
        }
        System.out.println(min + " " + max); //결과값 출력
    }
}