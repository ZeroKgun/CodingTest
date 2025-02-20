import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int poke : nums){
            map.put(poke, map.getOrDefault(poke,0)+1);
        }
        if(map.size() <= nums.length/2) return map.size();
        else return nums.length/2;
        
    }
}