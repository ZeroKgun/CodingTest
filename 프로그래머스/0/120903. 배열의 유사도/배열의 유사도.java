import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        HashSet<String> t1 = new HashSet<>();
        HashSet<String> t2 = new HashSet<>();
        
        for(String s : s1){
            t1.add(s);
        }
        for(String s : s2){
            t2.add(s);
        }
        
        for(String t : s1){
            if(t2.contains(t)) answer++;
        }
        return answer;
    }
}