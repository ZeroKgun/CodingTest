class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x =0;
        int y = 0;
        int num = 1;
        int dir = 0;
        int[] xdir = {1,0,-1,0};
        int[] ydir = {0,1,0,-1};
        for(int i = 1;i<=n*n;i++){
            answer[y][x] = i;
            int nextX = x+xdir[dir];
            int nextY = y+ydir[dir];
            
            if(nextX>=n || nextX<0){
                dir = (dir + 1)%4;
            }
            else if(nextY>=n || nextY<0){
                dir = (dir + 1)%4;
            }
            else if(answer[nextY][nextX] > 0){
                dir = (dir + 1)%4;
            }
            
            x = x+xdir[dir];
            y = y+ydir[dir];
        }
        return answer;
    }
}