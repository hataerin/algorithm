import java.io.*;
import java.util.*;

public class Main {
    static int K;
    static int V, E;
    static ArrayList<ArrayList<Integer>> map;

   public static void main(String[] args) throws IOException{
    StringTokenizer st;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    st = new StringTokenizer(br.readLine());
    K= Integer.parseInt(st.nextToken());
    String[] answer = new String[K];

    for(int i=0; i<K; i++) {
        st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        map = new ArrayList<ArrayList<Integer>>();
        for(int j=0; j<V; j++) {
            map.add(new ArrayList<Integer>());
        }

        //노드정보
        int start, end;
        for(int j=0; j<E; j++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken())-1;
            end = Integer.parseInt(st.nextToken())-1;
            map.get(start).add(end);
            //역으로도 성립
            map.get(end).add(start);
        }
        if(Coloring()) {
            answer[i] = "YES";
        }
        else {
            answer[i] = "NO";
        }

    }

    for(String s : answer) {
        System.out.println(s);
    }

   }

   public static boolean Coloring() {
       int[] colorMap = new int[V];

       //모든 경로에 대해 이동하면서, 색칠
       Stack<Integer> s = new Stack<Integer>();

       for(int i=0; i<V; i++) {
           //이미 색칠되어있으면 패스
           if(colorMap[i] != 0) continue;

           s.add(i);
           colorMap[i] = 1;

           while(!s.empty()) {
               int curr = s.pop();

               while(!map.get(curr).isEmpty()) {

                   int nextcurr = map.get(curr).get(0);

                   //색이 같은 경우 바로 탈락
                   if(colorMap[nextcurr] == colorMap[curr]) return false;


                   //아니고 방문하지 않은 경우
                   else if(colorMap[nextcurr] == 0){
                       colorMap[nextcurr] = -colorMap[curr];
                       //스택에 추가
                       s.push(nextcurr);
                   }   
                   //추가하고 나면 간선은 삭제 (다시 못하게)
                   map.get(curr).remove(0);
               }
           }
       }
    return true;   
   } 
}