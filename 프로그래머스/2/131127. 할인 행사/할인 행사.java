import java.util.*;


class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>(); // < 물품 , 원하는 수량 >
        // HashMap<String, Integer> cnt = new HashMap<>(); // <물품, 실 수량>
        
        for(int i=0; i<want.length; i++){
            map.put(want[i],number[i]);
        }
        
        for(int i = 0; i+9<discount.length; i++){
            HashMap<String, Integer> cnt = new HashMap<>(); // <물품, 실 수량>
            boolean check = true;
            for(int j = i; j<=i+9; j++){
                cnt.put(discount[j], cnt.getOrDefault(discount[j],0)+1);
            }
            
            for(String key: map.keySet()){
                if(!cnt.containsKey(key)){
                    check = false;
                    break;
                }
                else{
                    if(cnt.get(key) != map.get(key)){
                        check = false;
                        break;
                    }
                }
            }
            if(check) answer++;
        }
        
        return answer;
    }
}