import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Deque<Character> deque = new ArrayDeque<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(deque.isEmpty()) deque.push(c);
            else{
                if(deque.peek() == '(' && c == ')'){
                    deque.pop();
                }
                else{
                    deque.push(c);
                }
            }
        }
        
        return deque.isEmpty();
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        
    }
}