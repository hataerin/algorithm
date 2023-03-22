import java.io.*;
import java.util.*;
public class Main {
	static int n;
	static boolean[][] checked;
	static int[] cnt;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		checked = new boolean[n+1][n+1];
		cnt = new int[n+1];
		int num = n*(n-1)/2;
		int i = 1;
		bw.write("a1"+" ");
		while(num-->0) {
			for(int j = 1;j<=n;j++) {
				if(i==j)
					continue;
				if(!checked[i][j] && cnt[j] != n-2) {
					checked[i][j] = true;
					checked[j][i] = true;
					cnt[i]++;
					cnt[j]++;
					i = j;
					bw.write("a"+j+" ");
					break;
				}
			}
		}
		bw.write("a1" + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}