import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int total = 0;
        for(int i = 1; i<=n; i++){
            int start = i;
            total = 0;
            while(true){
                total += start;
                // System.out.println(total);
                if(total == n){
                    answer++;
                    break;
                }
                else if(total > n){
                    break;
                }
                start++;
            }
        }
        return answer;
    }
}