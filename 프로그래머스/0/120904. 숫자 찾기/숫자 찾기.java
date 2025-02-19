import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String tmp = String.valueOf(num);
        
        for(int i = 0; i<tmp.length(); i++){
            char c = tmp.charAt(i); 
            int l = Character.getNumericValue(c);
            if(k == l) return i+1;
        }
        return answer;
    }
}