import java.util.*;

class Solution {
    
    public HashMap<Integer, Integer> memo = new HashMap<>();
    
    
    public int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        
        if(n == 1){
            return 1;
        }
        
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int result = (fibonacci(n-1) + fibonacci(n-2))%1234567;
        memo.put(n, result);
        
        return result;
    }
    
    
    public int solution(int n) {
        
        memo.put(0,0);
        memo.put(1,1);
        return fibonacci(n);
    }
}