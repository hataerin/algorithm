import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;

	static int[] parent;		// 부모의 노드 번호 
	static int[] depth;		// 깊이 

	static LinkedList<Integer>[] list;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		list = new LinkedList[N + 1];
		for (int i = 1; i <= N; i++) {
			list[i] = new LinkedList<>();
		}

		// 간선의 정보 입력 
		for (int i = 0; i < N - 1; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			list[x].add(y);
			list[y].add(x);
		}

		// 루트는 1번 
		int START = 1;

		parent = new int[N + 1];
		depth = new int[N + 1];

		Queue<Integer> queue = new LinkedList<>();
		queue.add(START);
		parent[START] = START;
		depth[START] = START;

		while (!queue.isEmpty()) {

			int from = queue.poll();

			for (int to : list[from]) {

				if (parent[to] == 0) {
					// 아직 부모의 정보가 없는 노드이면 큐에 추가하고 부모의 정보와 깊이 정보를 입력 
					queue.add(to);
					parent[to] = from;
					depth[to] = depth[from] + 1;
				}
			}
		}

		M = sc.nextInt();

		while (M-- > 0) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			// 깊이가 더 깊은 쪽을 y 로 설정한다. 
			if (depth[x] > depth[y]) {
				int temp = x;
				x = y;
				y = temp;
			}

			// 같은 높이가 되도록 끌어 올린다. 
			while (depth[x] != depth[y]) {
				y = parent[y];
			}

			if (x == y) {
				System.out.println(x);
			} else {
				
				// 같은 부모가 될때까지 올라간다. 
				while (parent[x] != parent[y]) {
					x = parent[x];
					y = parent[y];
				}
				
				System.out.println(parent[x]);
			}			
		}
		
		sc.close();
	}
}