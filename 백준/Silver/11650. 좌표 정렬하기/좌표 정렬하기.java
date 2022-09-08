import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //좌표 개수
        int[][] arr = new int[N][2]; //좌표

        for (int n = 0; n < N; n++) { //좌표값 입력
            arr[n][0] = sc.nextInt();
            arr[n][1] = sc.nextInt();
        }

        //2차원 배열 정렬
        Arrays.sort(arr, new Comparator<int[]>() { // 1. Comparator 익명 클래스 구현
            @Override
            public int compare(int[] o1, int[] o2) {

                // 오름차순이 아닌경우 : 첫번째 기준 오름차순 > 두번째 기준 오름차순
                return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
            }
        });

        for (int n = 0; n < N; n++) {
            System.out.println(arr[n][0] + " " + arr[n][1]); // 결과값 출력
        }
        
    }
}