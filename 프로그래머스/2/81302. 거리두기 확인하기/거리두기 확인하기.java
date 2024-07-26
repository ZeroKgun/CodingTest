import java.util.*;

class Solution {
    
    static int[][] cnt;
    static boolean[][] visited;
    static int[] dr = {0,1,0,-1};
    static int[] dc = {1,0,-1,0};
    
    public static void init(){
        cnt = new int[5][5];
        visited = new boolean[5][5];
    }
    
    public static boolean isValid(int r, int c, String[] place){
        return (r>=0 && r<5) && (c>=0 && c<5) && (place[r].charAt(c) != 'X');
    }
    
    public static boolean bfs(int r, int c, String[] place){
        
        Queue<int []> que = new LinkedList<>();
        que.offer(new int[]{r,c});
        visited[r][c] = true;
        
        while(!que.isEmpty()){
            int[] cur = que.poll();
            int curR = cur[0];
            int curC = cur[1];
            if(cnt[curR][curC]<2){
                
                for(int i=0;i<4;i++){
                    int nextR = curR + dr[i];
                    int nextC = curC + dc[i];
                    if(isValid(nextR,nextC,place)){
                        if(visited[nextR][nextC] == false){
                            if(place[nextR].charAt(nextC) == 'P'){
                                return false;
                            }
                            else{
                                visited[nextR][nextC] = true;
                                que.offer(new int[]{nextR, nextC});
                                cnt[nextR][nextC] = cnt[curR][curC] + 1;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        Arrays.fill(answer,1);
        
        init();
        
        
        for(int i=0; i<places.length; i++){
            boolean check = true;
            for(int j=0; j<places[i].length; j++){
                for(int k =0; k<places[i][j].length(); k++){
                    if(places[i][j].charAt(k) == 'P'){
                        check = bfs(j,k,places[i]);
                        init();
                    }
                    if(!check) break;
                }
                if(!check){
                    answer[i] = 0;
                    break;
                }
            }
        }
        
        
        return answer;
    }
}