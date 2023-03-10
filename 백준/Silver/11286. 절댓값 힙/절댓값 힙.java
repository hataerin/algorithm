import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2)->{ //비교할 객체 선언
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            if (first_abs == second_abs) {
                // 절댓값이 같은 경우 음수 우선
                return o1 > o2 ? 1 : -1;
            }

            // 절댓값 작은 데이터 우선
            return first_abs - second_abs; //첫번째데이터가 더 크면 양수 리턴, 아니면 음수 리턴
        });

        for (int i = 0; i < N; i++) {
            int request = Integer.parseInt(br.readLine());
            if (request == 0) {
                if (q.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(q.poll());
                }
            } else {
                q.add(request);
            }
        }
    }
}
