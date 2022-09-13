import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int n = 0; n < N; n++) {
            arr[n] = br.readLine();
        }

        //풀이
        Arrays.sort(arr); //알파벳 순 정렬
        Arrays.sort(arr, Comparator.comparing(String::length)); //길이 순 정렬
        String[] resultArr = Arrays.stream(arr).distinct().toArray(String[]::new); //중복제거


        //출력
        for (int n = 0; n < resultArr.length; n++) {
            bw.write(resultArr[n] + "\n");
        }

        bw.flush();
        bw.close();
    }
}