import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<my_string.length(); i++){
            if(!set.contains(my_string.charAt(i))){
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}