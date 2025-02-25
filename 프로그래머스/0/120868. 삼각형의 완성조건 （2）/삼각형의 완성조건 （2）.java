import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        HashSet<Integer> set = new HashSet<>();
        
        int bigger = sides[1];
        int smaller = sides[0];
        
        int cnt1 = 0;
        
        for(int i=1; i<=bigger ; i++){
            if(i+smaller > bigger) set.add(i);
        }
        
        int cnt2 = 0;
        
        for(int i=bigger; i<bigger+smaller; i++){
            if(!set.contains(i)) set.add(i);
        }
        answer = set.size();
        return answer;
    }
}