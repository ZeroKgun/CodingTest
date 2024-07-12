import java.util.*;

class Solution {
    
    static HashSet<Integer> set;
    
    static int answer;
    
    public int solution(String numbers) {
        answer = 0;
        set = new HashSet<>();
        boolean[] visited = new boolean[numbers.length()];
        backtrack(new StringBuilder(), numbers, visited);
        return answer;
    }
    
    public void backtrack(StringBuilder tmp, String numbers, boolean[] visited) {
        if (tmp.length() > 0) {
            int snum = Integer.parseInt(tmp.toString());
            if (isS(snum) && !set.contains(snum)) {
                answer++;
                set.add(snum);
            }
        }
        
        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                tmp.append(numbers.charAt(i));
                backtrack(tmp, numbers, visited);
                tmp.deleteCharAt(tmp.length() - 1);
                visited[i] = false;
            }
        }
    }
    
    public boolean isS(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}