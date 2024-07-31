import java.util.*;
import java.io.*;

public class Main {

    static int rowLength;
    static int colLength;
    static int[] dirr = {0,1,0,-1};
    static int[] dirc = {1,0,-1,0};

    static boolean[][] visited;
    static int[][] distance;
    static int[][] map;

    public static boolean isValid(int r, int c){
        return (r >= 0 && r < rowLength) && (c >= 0 && c < colLength) && (map[r][c] != 0);
    }

    public static void bfs(int r, int c){
        Queue<int[]> que = new LinkedList<>();
        visited[r][c] = true;
        que.offer(new int[]{r, c});

        while(!que.isEmpty()){
            int[] cur = que.poll();
            int curr = cur[0];
            int curc = cur[1];

            for(int i =0; i<4; i++){
                int nextR = cur[0] + dirr[i];
                int nextC = cur[1] + dirc[i];
                if(isValid(nextR, nextC)) {
                    if (visited[nextR][nextC] == false) {
                        visited[nextR][nextC] = true;
                        que.offer(new int[]{nextR, nextC});
                        distance[nextR][nextC] = distance[curr][curc] + 1;
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int startr=0;
        int startc=0;
        rowLength = Integer.parseInt(st.nextToken());
        colLength = Integer.parseInt(st.nextToken());
        visited = new boolean[rowLength][colLength];
        distance = new int[rowLength][colLength];
        map = new int[rowLength][colLength];

        for(int i = 0; i < rowLength; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < colLength; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    startr = i;
                    startc = j;
                }
                else if(map[i][j] == 1){
                    distance[i][j] = -1;
                }
            }
        }
        bfs(startr, startc);

        for(int i = 0; i < rowLength; i++){
            for(int j = 0; j < colLength; j++){
                bw.write(distance[i][j] + " ");
            }
            bw.write("\n");
        }


        bw.close();
        br.close();
    }

}