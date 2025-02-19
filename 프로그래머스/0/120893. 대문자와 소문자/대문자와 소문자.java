import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c>= 'a' && c<= 'z'){
                sb.append(Character.toUpperCase(c));
            }
            else{
                sb.append(Character.toLowerCase(c));
            }
        }
        answer = sb.toString();
        return answer;
    }
}