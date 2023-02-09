import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
      static int N, student; //스위치 개수, 학생 수
    static int[] swtch, gender, number;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        swtch = new int[N+1];

        //입력
        swtch[0] = -1;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            swtch[i] = Integer.parseInt(st.nextToken());
        }
        student = Integer.parseInt(br.readLine());
        gender = new int[student];
        number = new int[student];
        for (int i = 0; i < student; i++) {
            st = new StringTokenizer(br.readLine());
            gender[i] = Integer.parseInt(st.nextToken());
            number[i] = Integer.parseInt(st.nextToken());
        }

        //순서대로 스위치 바꾸기
        for (int i = 0; i < student; i++) {
            if (gender[i] == 1) {
                boy(number[i]);
            } else {
                girl(number[i]);
            }
        }

        //출력
        for (int i = 1; i <= N; i++) {
            System.out.print(swtch[i] + " ");
            if (i % 20 == 0) System.out.println(); //20개단위로 자르기
        }
        System.out.println();

    }

    //스위치바꾸기
    static private void change(int i) {
        if (swtch[i] == 0) {
            swtch[i] = 1;
        } else {
            swtch[i] = 0;
        }
    }

    //배수인 경우 스위치 바꾸기
    static private void boy(int i) {
        for (int j = 1; j <= N; j++) {
            if (j % i != 0) continue;
            change(j);
        }
    }

    //가장 많은 좌우대칭 구간 바꾸기기
    static private void girl(int i) {
        change(i);
        for (int n = 1; n <= N; n++) {
            if (i+n > N || i-n < 0) break;
            if (swtch[i + n] == swtch[i - n]) { //대칭일 경우
                change(i+n);
                change(i-n);
            }
            else {
                break;
            }
        }
    }
}
