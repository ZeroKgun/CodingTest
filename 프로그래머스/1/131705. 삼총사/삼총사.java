import java.util.*;

class Solution {
    
    static int answer;
    static boolean[] visited;
    
    public void combination(int[] number, int cnt, int sum, int idx){
        
        if(cnt == 3){
            if(sum==0) answer++;
            return;
        }
        
        for(int i = idx; i<number.length; i++){
            if(!visited[i]){
                visited[i] = true;
                combination(number, cnt + 1, sum + number[i], i+1);
                visited[i] = false;
            }
        }
        
        
    }
    public int solution(int[] number) {
        answer = 0;
        visited = new boolean[number.length];
        combination(number, 0, 0, 0);
        return answer;
    }
}