import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Character> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        char[] tmp = s.toCharArray();
        for(char c : tmp){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        for(char c : map.keySet()){
            if(map.get(c) == 1) list.add(c);
        }
        Collections.sort(list);
        for(char c : list){
            answer += c;
        }
        return answer;
    }
}