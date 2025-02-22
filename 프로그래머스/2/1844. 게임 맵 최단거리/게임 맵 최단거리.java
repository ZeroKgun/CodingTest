import java.util.*;

class Solution {
    
    int[] dx = {0,1,0,-1};
    int[] dy = {1,0,-1,0};
    
    int[][] visited;
    int n,m;
    
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        
        visited = new int[n][m];
        visited[0][0] = 1;
        
        Queue<int []> que = new LinkedList<>();
        
        que.offer(new int[]{0,0});
        
        while(!que.isEmpty()){
            int[] cur = que.poll();
            
            int curx = cur[0];
            int cury = cur[1];
            
            for(int i =0;i<4;i++){
                int nx = curx + dx[i];
                int ny = cury + dy[i];
                
                if(nx>=0 && nx<n && ny>=0 && ny<m){
                    if(visited[nx][ny] == 0 && maps[nx][ny] != 0){
                        visited[nx][ny] = visited[curx][cury]+1;
                        que.offer(new int[]{nx,ny});
                    }
                }
            }
        }
        if(visited[n-1][m-1] > 0) return visited[n-1][m-1];
        else return -1;
    }
}