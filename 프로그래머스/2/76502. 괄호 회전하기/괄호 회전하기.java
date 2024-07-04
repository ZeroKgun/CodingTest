import java.util.*;

class Solution {
    public boolean isOk(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                if(stack.peek()=='('){
                    stack.pop();
                }
            }
            else if(s.charAt(i) == '}'){
                if(stack.peek() == '{'){
                    stack.pop();
                }
            }
            else if(s.charAt(i) == ']'){
                if(stack.peek() == '['){
                    stack.pop();
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        
        return stack.isEmpty();
        
    }
    
    
    
    
    public int solution(String s) {
        int answer = 0;
        
        String check = s;
        for(int i = 0; i<s.length(); i++){
            check = check.substring(1)+check.substring(0,1);
            if(isOk(check)) answer++;
        }
        
        return answer;
    }
}