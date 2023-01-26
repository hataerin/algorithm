import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] elements;
    static int[] numbers;
    static boolean[] isSelected;


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        elements = new int[N];
        numbers = new int[M];
        isSelected = new boolean[N];

        for (int i = 0; i < N; i++) {
            elements[i] = sc.nextInt();
        }
        Arrays.sort(elements);

        permutation(0);
    }

    //중복X 순열
    private static void permutation(int cnt) {
        //기저조건
        if (cnt == M) {
            print(numbers);
            return;
        }

        //유도파트
        for (int i = 0; i < N; i++) {
            if(isSelected[i]) continue;
            numbers[cnt] = elements[i];
            isSelected[i] = true;
            permutation(cnt + 1);
            isSelected[i] = false;
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
