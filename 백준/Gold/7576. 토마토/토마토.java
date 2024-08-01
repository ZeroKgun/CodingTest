
import java.io.*;
import java.util.*;


public class Main {

    static int rowLength;
    static int colLength;

    static int startr;
    static int startc;

    static int[] dirr = {0,1,0,-1};
    static int[] dirc = {1,0,-1,0};

    static boolean[][] visited;
    static int[][] cnt;
    static int[][] tomato;
    static int answer = 0;
    public static boolean isValid(int row, int col) {
        return (row >= 0 && row < rowLength) && (col >= 0 && col < colLength) && (tomato[row][col] != -1);
    }

//    public static int allGood(){
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i < rowLength; i++){
//            for(int j = 0; j < colLength; j++){
//                if(cnt[i][j] == 0){
//                    return 0;
//                }
//                else{
//                    max = Math.max(max, cnt[i][j]);
//                }
//            }
//        }
//
//        return max;
//    }

    public static void bfs(Queue<int[]> que) {

        while(!que.isEmpty()) {
            int[] cur = que.remove();
            int curr = cur[0];
            int curc = cur[1];

            for(int i=0; i<4; i++){
                int nextR = curr+dirr[i];
                int nextC = curc+dirc[i];

                if(isValid(nextR, nextC)){
                    if(!visited[nextR][nextC] && tomato[nextR][nextC] == 0){
                        visited[nextR][nextC] = true;
                        cnt[nextR][nextC] = cnt[curr][curc] + 1;
                        answer = Math.max(answer, cnt[nextR][nextC]);
                        que.add(new int[]{nextR, nextC});
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        rowLength = M;
        colLength = N;
        visited = new boolean[rowLength][colLength];
        cnt = new int[rowLength][colLength];
        tomato = new int[rowLength][colLength];
        Queue<int[]> que = new ArrayDeque<>();

        for(int i=0;i<rowLength;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<colLength;j++) {
                tomato[i][j] = Integer.parseInt(st.nextToken());
                if(tomato[i][j] == 1) {
                    que.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        bfs(que);
//        for(int i=0;i<rowLength;i++) {
//            for(int j=0;j<colLength;j++) {
//                bw.write(cnt[i][j]+"\t");
//            }
//            bw.write("\n");
//        }
//        bw.write("------------------------\n");

        boolean isOkay = true;
        for(int i=0;i<rowLength;i++) {
            for(int j=0;j<colLength;j++) {
               if(tomato[i][j] == 0 && !visited[i][j]){
                   isOkay = false;
                   break;
               }
            }
            if(!isOkay) break;
        }

        if (!isOkay) {
            bw.write("-1\n");
        } else {
            bw.write(answer + "\n");
        }

        bw.close();
        br.close();
    }
}