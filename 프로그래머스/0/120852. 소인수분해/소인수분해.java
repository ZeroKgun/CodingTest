import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int d = 2; d*d<=n; d++){
            if(n % d == 0){
                list.add(d);
                while(n%d ==0){
                    n = n /d;
                }
            }
        }
        if(n>1) list.add(n);
        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}

//
