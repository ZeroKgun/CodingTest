import java.util.*;


class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if(isOk(s)) answer++;
        
        
        for(int i = 1; i<s.length(); i++){
            s = s.substring(1,s.length()) + s.substring(0,1);
            // System.out.println(s);
            if(isOk(s)) answer++;
        }
        return answer;
    }
    
    public boolean isOk(String s){
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(!stack.isEmpty()){
                char c = stack.peek();
                
                if(c == '[' && s.charAt(i) == ']'){
                    stack.pop();
                }
                else if(c=='{' && s.charAt(i) =='}'){
                    stack.pop();
                }
                else if(c=='(' && s.charAt(i)==')'){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}