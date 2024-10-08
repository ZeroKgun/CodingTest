import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                if(stack.peek() == '('){
                    stack.pop();
                }
            }
            else{
                stack.push(s.charAt(i));
            }
            
        }
        return stack.isEmpty();
    }
}