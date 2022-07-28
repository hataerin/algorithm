import java.util.Scanner;
  
public class Solution {
  
    static int T, N, M;
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        T = sc.nextInt();
  
        for (int t = 1; t <= T; t++) { //테케만큼 반복
  
            N = sc.nextInt();
            M = sc.nextInt();
  
            int arr[][] = new int[N][N];
  
            for (int r = 0; r < N; r++) { // 파리 개수 입력
                for (int c = 0; c < N; c++) {
                    arr[r][c] = sc.nextInt();
                }
            }
  
            int max = 0;
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) { //완탐
  
                    int sum = 0;
                    for (int i = 0; i < M; i++) {
                        for (int j = 0; j < M; j++) { //파리채 크기
  
                            if (r + i >= 0 && r + i < N && c + j >= 0 && c + j < N) { //범위체크
                                sum += arr[r + i][c + j]; // 죽은 파리의 개수
                            }
                        }
                    }
                    if (sum > max) max = sum; //파리 최댓값 갱신
                }
            }
            System.out.println("#"+t+" "+max); // 최댓값 출력력
  
        }
   }
}