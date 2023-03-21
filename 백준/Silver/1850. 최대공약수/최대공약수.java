import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long num = gcd(a,b);
		
		for(int i = 0; i < num; i++) {
			bw.write("1");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

	private static long gcd(long a, long b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}
}