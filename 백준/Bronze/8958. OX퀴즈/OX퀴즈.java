import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        for (int t = 0; t < T; t++) { //테케만큼 반복
            String str = sc.nextLine();
            char[] charArr = str.toCharArray();

            char ex = 'X';
            int score = 1, result = 0;
            for (int i = 0; i < charArr.length; i++) {

                if (ex == charArr[i]) //연속으로 맞았을 때
                    score++;
                else //틀렸을 때
                    score = 1;

                if (charArr[i] == 'O') result += score;

                ex = charArr[i]; //[i-1]값과 비교
            }
            System.out.println(result);
        }
    }
}