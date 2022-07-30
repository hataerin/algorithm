import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int max = -1;   //최댓값
       int index = -1;  //몇 번째 수인지

        for (int i = 1; i < 10; i++) { //테케 입력
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < 10; i++) {
            if (arr[i] > max) {
                max = arr[i];//최댓값 갱신
                index = i;  //인덱스 저장
            }
        }

        System.out.println(max);
        System.out.println(index);

    }
}