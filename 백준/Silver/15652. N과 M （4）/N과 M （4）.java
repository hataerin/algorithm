import java.util.Scanner;

public class Main {

    static int N, M;
    static int[] numbers;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        numbers = new int[M];

        combination(0, 1);
        System.out.println(sb);

    }

    //중복O 조합, 오름차순
    private static void combination(int cnt, int start) {
        //기저조건
        if (cnt == M) {
            print(numbers);
            return;
        }
        //유도파트
        for (int i = start; i <= N; i++) {
            numbers[cnt] = i;
            combination(cnt+1, i);
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        sb.append("\n");
    }
}
