import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int N;
    static int M;
    static StringBuilder sb;
    static Stack<Integer> alreadyIn;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        sb = new StringBuilder();
        alreadyIn = new Stack<>();

        recur(0, "");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString().trim());
        bw.close();
    }

    public static void recur(int applyNum, String makingStr) {
        if (applyNum == M) {
            sb.append(makingStr.trim() + "\n");

        } else {
            ++applyNum;
            for (int i = 1; i <= N; i++) {
                if (!alreadyIn.contains(i)) {
                    alreadyIn.push(i);
                    recur(applyNum, makingStr + " " + i);
                    alreadyIn.pop();
                }
            }
        }
    }
}