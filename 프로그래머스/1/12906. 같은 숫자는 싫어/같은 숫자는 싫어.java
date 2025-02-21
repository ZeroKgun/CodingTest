import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Deque<Integer> deque = new ArrayDeque<>();
        
        for(int num: arr){
            if(deque.isEmpty()) deque.push(num);
            else if(!deque.isEmpty() && deque.peek() != num){
                deque.push(num);
            }
        }
        answer = new int[deque.size()];
        for(int i = answer.length-1; i>=0; i--){
            answer[i] = deque.pop();
        }
        

        return answer;
    }
}