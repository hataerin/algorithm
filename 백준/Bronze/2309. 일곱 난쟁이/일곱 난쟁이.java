import java.util.Arrays;
import java.util.Scanner;

public class Main {

   static int[] height, result; //모든 키, 진짜 난쟁이의 키
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        height = new int[9];
        result = new int[7];

        for (int i = 0; i < 9; i++) {
            height[i] = sc.nextInt();
        }
        Arrays.sort(height);

        combination(0, 0);
    }

    //중복X 조합
    private static void combination(int cnt, int start) {
        //기저조건
        if (cnt == 7) {
            print(result);
            return;
        }
        //유도파트
        for (int i = start; i < 9; i++) {
            if(cnt > 7) continue;
            result[cnt] = height[i];
            combination(cnt+1, i+1);
        }
    }
    private static void print(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; //키 누적합 구하기
        }

        if(sum == 100) { //키 누적합이 100인 경우에만 출력
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            System.out.println(sb);
            System.exit(0); //정답이 여러개인 경우 하나만 출력
        }
    }
}
