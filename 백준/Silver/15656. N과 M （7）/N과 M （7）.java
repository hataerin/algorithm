import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int N, M;
    static int[] elements;
    static int[] numbers;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        elements = new int[N];
        numbers = new int[M];

        for (int i = 0; i < N; i++) {
            elements[i] = sc.nextInt();
        }
        Arrays.sort(elements);

        permutation(0);
        System.out.println(sb);
    }

    //중복O 순열
    private static void permutation(int cnt) {
        //기저조건
        if (cnt == M) {
            print(numbers);
            return;
        }

        //유도파트
        for (int i = 0; i < N; i++) {
            numbers[cnt] = elements[i];
            permutation(cnt + 1);
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        sb.append("\n");
    }


}
