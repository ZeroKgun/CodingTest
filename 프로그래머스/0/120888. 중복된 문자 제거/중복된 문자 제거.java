import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            
            if(!set.contains(c)){
                set.add(c);
                answer += String.valueOf(c);
            }
        }
        return answer;
    }
}