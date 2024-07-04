import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int total = 0;
        HashMap<Integer, Integer> tMap = new HashMap<>(); //< 무게, 개수 >
        ArrayList<Integer> wList = new ArrayList<>();
        
        for(int weight : tangerine){
            tMap.put(weight, tMap.getOrDefault(weight,0) + 1);
        }
        
        for(int w : tMap.keySet()){
            wList.add(w);
        }
        
        Collections.sort(wList, (w1,w2)-> tMap.get(w2) - tMap.get(w1));
        
        for(int w : wList){
            total = total + tMap.get(w);
            if(total >= k) {
                answer++;
                break;
            }
            answer++;
        }
        
        return answer;
    }
}