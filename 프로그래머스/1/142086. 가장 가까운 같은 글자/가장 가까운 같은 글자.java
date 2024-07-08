import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] sarr = s.split("");
        int[] answer = new int[sarr.length];
        Arrays.fill(answer,-1);
        
        for(int i=1; i<sarr.length; i++){
            for(int j=i-1;j>=0;j--){
                if(sarr[i].equals(sarr[j])){
                    answer[i] = i-j;
                    break;
                }
            }
        }
        return answer;
    }
}