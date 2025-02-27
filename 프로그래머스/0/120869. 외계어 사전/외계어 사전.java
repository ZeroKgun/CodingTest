import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int len = spell.length;
        
        for(String d : dic){
            int cnt = 0;
            HashMap<String, Integer> map = new HashMap<>();
            for(int i=0; i<d.length(); i++){
                char c = d.charAt(i);
                String key = String.valueOf(c);
                map.put(key, map.getOrDefault(key,0)+1);
            }
            for(String s : spell){
                if(map.containsKey(s) && map.get(s) == 1){
                    cnt++;
                }
            }
            if(cnt == len) return 1;
            
        }
        return answer;
    }
}