import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    static int M, N;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        M = Integer.parseInt(str[0]);
        N = Integer.parseInt(str[1]);
        StringBuilder sb = new StringBuilder();

        boolean[] nbox=new boolean[N+1];
        nbox[0] = nbox[1] = true;


        for(int i = 2 ; i <= Math.sqrt(nbox.length) ; i++) {
            if(nbox[i]) continue;	//이미 소수로 판별되었으면 아래 FOR문을 생략
            for(int j = i*i ; j < nbox.length ; j +=i)	//배수값을 TRUE로 바꾸어 소수에서 제외
                nbox[j] =true;
        }


        for(int i = M ; i <= N ; i++)
            if(!nbox[i]) sb.append(i).append("\n");

        System.out.println(sb.toString());
    }
}