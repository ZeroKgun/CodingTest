import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        String t = String.valueOf(age);
        
        for(int i =0; i<t.length(); i++){
            answer += (char)('a' + Character.getNumericValue(t.charAt(i)));
        }
        return answer;
    }
}