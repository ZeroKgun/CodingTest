import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int cnt = 0;
        
        for(int i = 0; i<prices.length; i++){
            cnt = 0;
            for(int j = i; j<prices.length; j++){
                if(prices[i] > prices[j]){
                    answer[i] = cnt;
                    break;
                }
                cnt++;
                if(j==prices.length-1){
                    answer[i] = cnt-1;
                }
            }
        }
        return answer;
    }
}