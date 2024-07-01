import java.util.*;


class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0 ; i<ingredient.length; i++){
            stack.push(ingredient[i]);
            int size = stack.size();
            if(size>=4){
                if(stack.get(size-1) == 1 && stack.get(size-2) == 3 && stack.get(size-3) ==2 && stack.get(size-4) == 1){
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    answer += 1;
                }
                    
            }
        }
        return answer;
    }
    
    
    
    // 빵 1 야채 2 고기 3
    // 빵 - 야채 - 고기 - 빵
    // 1  -   2  -  3  - 1  => 1개
}