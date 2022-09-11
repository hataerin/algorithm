import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(bf.readLine());

        for (int n = 0; n < N; n++) {
            String str = bf.readLine();
            String[] arr = str.split(" ");

            switch (arr[0]){
                case "push" :
                    stack.push(Integer.parseInt(arr[1]));
                    break;
                case "pop" :
                    if (stack.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(stack.pop() + "\n");
                    break;
                case "size" :
                    bw.write(stack.size() + "\n");
                    break;
                case "empty" :
                    if (stack.isEmpty()) bw.write(1 + "\n");
                    else bw.write(0 + "\n");
                    break;
                case "top" :
                    if(stack.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(stack.peek() + "\n");
                    break;
            }
        }
        bw.flush(); //버퍼 비우고
        bw.close(); //스트림 닫기
    }
}