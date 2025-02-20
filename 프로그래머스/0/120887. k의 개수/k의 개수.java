import java.util.*;


class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String s = "";
        for(int a = i; a<=j; a++){
            s += String.valueOf(a);
        }
        for(int a = 0; a<s.length(); a++){
            char c = s.charAt(a);
            if(Character.getNumericValue(c) == k) answer++;
        }
        return answer;
    }
}