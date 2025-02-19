import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        String tmp = String.valueOf(order);
        for(int i =0; i<tmp.length(); i++){
            char c = tmp.charAt(i);
            int l = Character.getNumericValue(c);
            if(l%3==0 && l != 0) answer++;
        }
        return answer;
    }
}