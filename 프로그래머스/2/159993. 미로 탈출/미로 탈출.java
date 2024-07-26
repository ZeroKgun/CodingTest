import java.util.*;

class Solution {
    
    static int rowLength;
    static int colLength;
    static boolean[][] visited;
    static int[][] cnt;
    static int[] dr = {0,1,0,-1};
    static int[] dc = {1,0,-1,0};
    static int leverR;
    static int leverC;
    
    
    public static boolean isValid(int r, int c, String[] maps){
        return (r>=0 && r<rowLength) && (c>=0 && c<colLength) && (maps[r].charAt(c) != 'X');
    }
    
    public static void bfsL(int r, int c, String[] maps){
        Queue<int []> que = new LinkedList<>();
        
        que.offer(new int[]{r,c});
        visited[r][c] = true;
        
        while(!que.isEmpty()){
            
            int[] cur = que.poll();
            int curR = cur[0];
            int curC = cur[1];
            if(maps[curR].charAt(curC) == 'L'){
                leverR = curR;
                leverC = curC;
                return;
            }
            
            for(int i=0; i<4; i++){
                int nextR = curR + dr[i];
                int nextC = curC + dc[i];
                if(isValid(nextR,nextC,maps)){
                    if(visited[nextR][nextC] == false){
                        cnt[nextR][nextC] = cnt[curR][curC] + 1;
                        visited[nextR][nextC] = true;
                        que.offer(new int[]{nextR, nextC});
                        
                    }
                }
            }
        }
    }
    
    public static int bfsE(int r, int c, String[] maps){
        Queue<int []> que = new LinkedList<>();
        
        que.offer(new int[]{r,c});
        visited[r][c] = true;
        
        while(!que.isEmpty()){
            int[] cur = que.poll();
            int curR = cur[0];
            int curC = cur[1];
            if(maps[curR].charAt(curC) == 'E'){
                return cnt[curR][curC];
            }
            
            for(int i=0; i<4; i++){
                int nextR = curR + dr[i];
                int nextC = curC + dc[i];
                if(isValid(nextR,nextC,maps)){
                    if(visited[nextR][nextC] == false){
                        que.offer(new int[]{nextR,nextC});
                        visited[nextR][nextC] = true;
                        cnt[nextR][nextC] = cnt[curR][curC] + 1;
                    }
                }
            }
        }
        return -1;
    }
    
    public int solution(String[] maps) {
        int answer = -1;
        int startR = 0;
        int startC = 0;
        rowLength = maps.length;
        colLength = maps[0].length();
        
        for(int i=0; i<rowLength; i++){
            if(maps[i].indexOf("S") != -1){
                startR = i;
                startC = maps[i].indexOf("S");
                break;
            }
        }
        visited = new boolean[rowLength][colLength];
        cnt = new int[rowLength][colLength];
        
        
        bfsL(startR,startC,maps);
        visited = new boolean[rowLength][colLength];
        for(int[] arr : cnt){
            for(int num: arr){
                System.out.print(num+" | ");
            }
            System.out.println();
        }
        return bfsE(leverR,leverC,maps);
    }
}

//일단 레버까지 가야함
//레버까지 가는 최단거리
    //레버까지 bfs후에 레버의 cnt값 이외에 나머지 초기화
        //아니지 초기화 할 필요가 없지 전에꺼 +1 하면 되잖아
        //visited만 초기화??
    //레버부터 exit까지 다시 bfs
//레버부터 exit 까지 최단거리