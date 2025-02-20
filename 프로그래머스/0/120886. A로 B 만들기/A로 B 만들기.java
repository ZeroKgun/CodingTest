import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        HashMap<Character, Integer> b = new HashMap<>();
        HashMap<Character, Integer> a = new HashMap<>();
        
        for(int i = 0; i<before.length(); i++){
            char bc = before.charAt(i);
            char ac = after.charAt(i);
            b.put(bc, b.getOrDefault(bc,0)+1);
            a.put(ac, a.getOrDefault(ac,0)+1);
        }
        
        for(Character bk : b.keySet()){
            if(b.get(bk) != a.get(bk)) return 0;
        }
        return answer;
    }
}