import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        Arrays.sort(strings, new Comparator<String>(){
            public int compare(String s1, String s2){
                if(s1.charAt(n) > s2.charAt(n)){
                    return 1;
                }
                else if(s1.charAt(n) == s2.charAt(n)){
                    return s1.compareTo(s2);
                }
                else{
                    return -1;
                }
            }
        });
        return strings;
    }
}