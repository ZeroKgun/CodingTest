import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = 0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }
        int len = answer.length-1;
        while(!stack.isEmpty()){
            int idx = stack.pop();
            answer[idx] = len - idx;
        }
        return answer;
    }
}