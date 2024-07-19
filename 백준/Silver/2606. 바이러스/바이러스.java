import java.util.*;
import java.io.*;

public class Main {

    static Map<Integer,Boolean> visited =  new HashMap<>();
    static Map<Integer, List<Integer>> network = new HashMap<>();
    static int answer = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            network.put(i+1,new ArrayList<>());
        }
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            network.get(x).add(y);
            network.get(y).add(x);
        }
        dfs(1);
        bw.write(answer + "\n");
        bw.close();
        br.close();
    }

    public static void dfs(int start){
        visited.put(start,true);


        for(Integer next : network.get(start)){
            if(!visited.containsKey(next)){
                answer++;
                dfs(next);
            }
        }
    }
}
