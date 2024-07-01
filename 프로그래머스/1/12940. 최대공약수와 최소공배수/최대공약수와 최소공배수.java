import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int big = Math.max(n,m);
        int small = Math.min(n,m);
        for(int i = small; i>=1; i--){
            if(n % i == 0 && m % i ==0){
                answer[0] = i;
                break;
            }
        }
        for(int i = 1; i<=small ; i++){
            if((i*big) % small == 0){
                answer[1] = i*big;
                break;
            }
        }
        return answer;
    }
}