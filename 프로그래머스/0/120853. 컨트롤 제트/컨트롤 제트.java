import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        String[] arr = s.split(" ");
        for(String st : arr){
            if(st.equals("Z")){
                stack.pop();
            }
            else{
                stack.push(Integer.valueOf(st));
            }
        }
        
        while(!stack.isEmpty()){
            int num = stack.pop();
            answer += num;
        }
        return answer;
    }
}