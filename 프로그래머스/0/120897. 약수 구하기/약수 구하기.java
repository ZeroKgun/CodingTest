import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> l = new ArrayList<>();
        l.add(1);

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) l.add(i);
        }

        
        int[] answer = l.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
