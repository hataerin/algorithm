import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0, minCount = -1;

        char arr[][] = new char[N][M];

        for (int n = 0; n < N; n++) { //체스판 입력
            String str = sc.next();
            arr[n] = str.toCharArray();
        }


        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {

								// 추가된 부분
                char[] testchar = new char[]{'B', 'W'};
                for (int k = 0; k < 2; k++) {
                    char chess[][] = createChess(testchar[k]); //시작하는 문자로 체스판만들기

                    for (int row = i; row < i + 8; row++) {
                        for (int column = j; column < j + 8; column++) {
                            try {
                                if (arr[row][column] != chess[row - i][column - j]) //체스판이랑 예시랑 비교
                                    count++; //다르면 +1
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    if (minCount == -1 || count < minCount) {
                        minCount = count; //최소값 갱신
                    }
                    count = 0;
                }
            }
        }

        System.out.println(minCount);

    }

    static private char[][] createChess(char base) {
        char chess[][] = new char[8][8];
        char nextChess = base;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chess[i][j] = nextChess;
                nextChess = getNextChess(nextChess);
            }
            nextChess = chess[i][7];
        }
        return chess;
    }

    static private char getNextChess(char chess) {
        if (chess == 'W') return 'B';
        else return 'W';
    }
}