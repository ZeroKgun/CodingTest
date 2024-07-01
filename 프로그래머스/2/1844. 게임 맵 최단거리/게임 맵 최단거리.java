import java.util.*;


class Solution {
    
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    
    int[][] tmpmaps, visited;
    int n,m;
    
    LinkedList<int[]> queue;
    
    public void bfs(){
        visited[0][0] = 1;
        queue = new LinkedList<int[]>();
        queue.add(new int[]{0,0});
        
        while(!queue.isEmpty()){
            int[] current = queue.remove();
            int x = current[0];
            int y = current[1];
            
            for(int i = 0; i<4 ;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx < 0 || nx >tmpmaps.length - 1 || ny<0 || ny>tmpmaps[0].length -1){
                    continue;
                }
                if(visited[nx][ny] == 0 && tmpmaps[nx][ny] == 1){
                    visited[nx][ny] = visited[x][y] + 1;
                    queue.add(new int[]{nx,ny});
                }
            }
        }
    }
    public int solution(int[][] maps) {
        int answer = 0;
        n = maps[0].length;
        m = maps.length;
        visited = new int[m][n];
        this.tmpmaps = maps;
        bfs();
        if(visited[m-1][n-1] == 0){
            answer = -1;
        }
        else {
            answer = visited[m-1][n-1];
        }
        return answer;
    }
}