import java.util.*;

class Solution {
    
    int[] dx = {0,1,0,-1};
    int[] dy = {1,0,-1,0};
    
    int n,m;
    boolean[][] visited;
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        n = maps.length;
        m = maps[0].length;
        
        visited = new boolean[n][m];
        int[][] cntmap = new int[n][m];
        
        Queue<int[]> que = new LinkedList<>();
        
        que.add(new int[]{0,0});
        visited[0][0] = true;
        cntmap[0][0] = 1;
        
        while(!que.isEmpty()){
            int[] cur = que.poll();
            int curx = cur[0];
            int cury = cur[1];
            
            for(int i=0; i<4; i++){
                int nx = curx + dx[i];
                int ny = cury + dy[i];
                
                if(nx>=0 && nx<n && ny>=0 && ny<m && maps[nx][ny] != 0){
                    if(!visited[nx][ny]){
                        que.add(new int[]{nx,ny});
                        cntmap[nx][ny] = cntmap[curx][cury] + 1;
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        if(cntmap[n-1][m-1] > 0) return cntmap[n-1][m-1];
        else return -1;
    }
}