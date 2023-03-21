import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] graph;

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int v = Integer.parseInt(stringTokenizer.nextToken());

        graph = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        dfs(v, new int[n + 1]);
        System.out.println();
        bfs(v, new int[n + 1]);
    }

    static void dfs(int node, int[] visited) {
        // 방문한 노드면 바로 return
        if (visited[node] == 1) {
            return;
        }
        // 아니면 방문했다고 체크하고 해당 노드를 출력
        visited[node] = 1;
        System.out.print(node + " ");

        for (int i = 1; i < n + 1; i++) {
            // 방문하지 않았었고 인접한 노드를 찾아서 재귀호출
            if (visited[i] == 0 && graph[node][i] == 1) {
                dfs(i, visited);
            }
        }
    }

    static void bfs(int node, int[] visited) {
        // bfs 구현에 필요한 자료구조 -> 다음 방문할 노드들을 저장한다
        Queue<Integer> queue = new LinkedList<>();
        // 처음 node는 무조건 방문을 안했었으니 방문체크를 하고
        visited[node] = 1;
        // 방문해야할 노드로 큐에 넣어준다.
        queue.add(node);

        // 방문해야할 노드가 없을 때까지
        while (!queue.isEmpty()) {
            // 방문 할 노드를 꺼내고 
            int currentNode = queue.poll();
            // 출력
            System.out.print(currentNode + " ");

            for (int i = 1; i < n + 1; i++) {
                // 방문하지 않았었고 인접한 노드를 찾아서
                if (visited[i] == 0 && graph[currentNode][i] == 1) {
                    // 다음번에 방문하라고 Queue에 넣어준다.
                    queue.add(i);
                    visited[i] = 1;
                }
            }
        }
    }
}