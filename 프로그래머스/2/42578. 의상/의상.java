import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String[] cl : clothes){
            map.put(cl[1], map.getOrDefault(cl[1],0)+1);
        }
        
        if(map.keySet().size()==1){
            return map.get(clothes[0][1]);
        }
        
        for(int count : map.values()){
            answer = answer * (count+1);
        }
        
        return answer-1;
    }
}