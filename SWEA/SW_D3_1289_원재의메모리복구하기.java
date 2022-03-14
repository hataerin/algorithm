package ps.day01;

import java.util.Scanner;

public class SW_D3_1289_원재의메모리복구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int j = 1; j <= T; j++) {
            System.out.print("#" + j + " ");
            solve(0, 0, sc.nextLine(), 0);
        }
    }

    public static void solve(int i, int cnt, String str, int bit) {

        String arr[] = str.split("");

        //기저조건
        if(i == arr.length) {
            System.out.println(cnt);
            return;
        }

        //유도파트
        if (Integer.parseInt(arr[i]) == bit) {
            solve(i + 1, cnt, str, bit);
        } else {
            bit = Integer.parseInt(arr[i]);
            solve(i+1, cnt+1, str, bit);
        }
    }

}


