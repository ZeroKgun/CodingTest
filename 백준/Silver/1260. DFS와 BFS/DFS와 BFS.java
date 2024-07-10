import java.io.*;
import java.util.*;

//1157
public class Main {

    static int N, M, V;
    static int x,y;

    static boolean[] visited;
    static boolean[][] map;
    static ArrayList<Integer> que = new ArrayList<>();

    public static void dfs(int idx){
        visited[idx] = true;
        System.out.print(idx + " ");
        for(int i = 1; i<=N; i++){
            if(visited[i] == false && map[idx][i] == true){
                dfs(i);
            }
        }
    }
    public static void bfs(int idx){

        que.add(idx);
        visited[idx] = true;

        while(!que.isEmpty()){
            int next = que.remove(0);
            System.out.print(next + " ");
            for(int i = 1; i<=N; i++){
                if(visited[i] == false && map[next][i] == true){
                    visited[i] = true;
                    que.add(i);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        map = new boolean[N+1][N+1];
        visited = new boolean[N+1];
        for(int i = 0; i<M ; i++){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            map[x][y] = true;
            map[y][x] = true;
        }

        dfs(V);
        System.out.println();
        visited = new boolean[N+1];
        bfs(V);

        bw.close();
        br.close();

    }
}