import java.util.Scanner;

public class Main {


    private static int N;
    private static String A = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.";
    private static String B = "\"재귀함수가 뭔가요?\"";
    private static String C1 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    private static String C2 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    private static String C3 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
    private static String D = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
    private static String E = "라고 답변하였지.";
    private static void recursive(int n, String dash) {
        //기저조건
        if (n == N) {
            System.out.println(dash + B);
            System.out.println(dash + D);
            System.out.println(dash + E);
            return;
        }

        //유도파트

        System.out.println(dash + B);
        System.out.println(dash + C1);
        System.out.println(dash + C2);
        System.out.println(dash + C3);
        recursive(n+1, dash+"____");
        System.out.println(dash + E);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        System.out.println(A);
        recursive(0, "");
    }
}
