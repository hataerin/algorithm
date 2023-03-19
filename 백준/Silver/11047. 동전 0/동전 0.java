import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int K;
	static int[] value;
	
	static int ans = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		value = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			value[i] = Integer.parseInt(br.readLine());
		}
		
		
		for(int i = N -1 ; i >= 0 ; i--) {
			if(K / value[i] >= 1) {
				ans += K/value[i];
				K = K%value[i];
			}
		}
		
		System.out.println(ans);
		
		}

}