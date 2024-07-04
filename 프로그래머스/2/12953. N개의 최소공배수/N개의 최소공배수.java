import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int pow = 1;
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        while(answer == 0){
            boolean ok = true;
            int minCh = max * pow;
            for(int i = 0; i<arr.length-1; i++){
                if(minCh % arr[i] != 0){
                    ok = false;
                    break;
                }
            }
            if(ok){
                answer = minCh;
                break;
            }
            pow++;
        }
        return answer;
    }
}