import java.util.*;

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] a = letter.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) != a[0]){
                sb.append(my_string.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }
}