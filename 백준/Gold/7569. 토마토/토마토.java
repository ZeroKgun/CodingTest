import java.util.*;
import java.io.*;

public class Main {

    static int heightLength;
    static int rowLength;
    static int colLength;

    static int[] dirh = {1,-1};
    static int[] dirr = { 0, 1, 0, -1 };
    static int[] dirc = { 1, 0, -1, 0 };
    static int[][][] tomato;
    static int[][][] cnt;
    static boolean[][][] visited;
    static int answer = 0;
    static Queue<int[]> que;

    public static boolean isValid(int h, int r, int c) {
        return (r < rowLength && r >= 0) && (c < colLength && c >= 0) && (h<heightLength && h>=0) && (tomato[h][r][c] != -1);
    }

    public static void bfs() {
        // que.add(new int[]{startR, startC});

        while (!que.isEmpty()) {
            int[] cur = que.remove();
            int curCnt = cnt[cur[0]][cur[1]][cur[2]];


            for (int i = 0; i < 4; i++) {
                int nextH = cur[0];
                int nextR = cur[1] + dirr[i];
                int nextC = cur[2] + dirc[i];

                if (isValid(nextH, nextR, nextC)) {
                    if (!visited[nextH][nextR][nextC]) {
                        visited[nextH][nextR][nextC] = true;
                        que.add(new int[] { nextH, nextR, nextC });
                        cnt[nextH][nextR][nextC] = curCnt + 1;
                        answer = Math.max(answer, cnt[nextH][nextR][nextC]);
                    }
                }
            }
            for(int i = 0; i<2; i++){
                int nextH = cur[0] + dirh[i];
                int nextR = cur[1];
                int nextC = cur[2];

                if (isValid(nextH, nextR, nextC)) {
                    if (!visited[nextH][nextR][nextC]) {
                        visited[nextH][nextR][nextC] = true;
                        que.add(new int[] { nextH, nextR, nextC });
                        cnt[nextH][nextR][nextC] = curCnt + 1;
                        answer = Math.max(answer, cnt[nextH][nextR][nextC]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        colLength = Integer.parseInt(st.nextToken());
        rowLength = Integer.parseInt(st.nextToken());
        heightLength = Integer.parseInt(st.nextToken());

        tomato = new int[heightLength][rowLength][colLength];
        cnt = new int[heightLength][rowLength][colLength];
        visited = new boolean[heightLength][rowLength][colLength];

        que = new ArrayDeque<>();

        for (int i = 0; i < heightLength; i++) {
            for (int j = 0; j < rowLength; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < colLength; k++) {
                    tomato[i][j][k] = Integer.parseInt(st.nextToken());
                    if(tomato[i][j][k] == 1){
                        que.add(new int[]{i,j,k});
                        visited[i][j][k] = true;
                    }
                }
            }
        }

        bfs();

        for(int i = 0; i<heightLength; i++){
            for(int j=0; j<rowLength; j++){
                for(int k=0; k<colLength; k++){
                    if(tomato[i][j][k]==0 && visited[i][j][k]==false){
                        bw.write("-1\n");
                        bw.close();
                        br.close();
                        return;
                    }
                }
            }
        }

        bw.write(answer + "\n");

        bw.close();
        br.close();

        return;
    }
}