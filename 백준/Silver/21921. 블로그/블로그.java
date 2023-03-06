import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, X, end, sum, max, cnt;
    static int[] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i< N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        end = 0;
        sum = 0;
        max = 0;
        cnt = 1;

        for(int i = 0; i< N; i++){
            while((end-i< X) && end< N){
                sum += arr[end];
                end++;
            }

            if(max == sum) cnt++;
            else if(max<sum){
                max = sum;
                cnt = 1;
            }
            sum -=arr[i];
        }

        if(max == 0){
            System.out.println("SAD");
            return;
        }

        System.out.println(max);
        System.out.println(cnt);
    }
}
