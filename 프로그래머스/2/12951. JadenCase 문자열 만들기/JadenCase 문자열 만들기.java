import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i=1; i<s.length(); i++){
            char c = s.charAt(i);
            if(s.charAt(i-1) == ' '){
                sb.append(Character.toUpperCase(c));
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}