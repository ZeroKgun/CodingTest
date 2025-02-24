import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int sub = Integer.MAX_VALUE;
        
        for(int num: array){
            int tmpSub = Math.abs(n-num);
            if(tmpSub < sub){
                answer = num;
                sub = tmpSub;
            }
            else if(tmpSub == sub){
                answer = Math.min(answer, num);
            }
        }
        return answer;
    }
}