import java.util.*;

public class Main {
    static int N, cnt; //지도 크기, 아파트 개수
    static ArrayList<Integer> block; //단지 개수
    static int[][] map;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    private static void dfs(int x, int y) {
        map[x][y] = 0;
        cnt += 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (map[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        //입력
        map = new int[N + 2][N + 2];
        for (int i = 1; i <= N; i++) {
            String str = sc.next();
            String[] strArr = str.split("");
            for (int j = 0; j < strArr.length; j++) {
                map[i][j + 1] = Integer.parseInt(strArr[j]);
            }
        }

        block = new ArrayList<>();
        for (int x = 0; x <= N; x++) {
            for (int y = 0; y <= N; y++) {
                cnt = 0;
                if (map[x][y] == 1) {
                    dfs(x, y);
                    block.add(cnt);
                }
            }
        }
        
        // 정렬 및 출력
        Collections.sort(block);
        System.out.println(block.size());
        for (int list : block) {
            System.out.println(list);
        }
    }
}
