import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) { //테케만큼 반복

           int R = sc.nextInt();
           String str = sc.next();
           char[] charArray = str.toCharArray();

            for (int c = 0; c < charArray.length; c++) {//문자 한개씩
                for (int r = 0; r < R; r++) { //R번 출력
                    System.out.print(charArray[c]);
                }
            }
            System.out.println();
        }
    }
}