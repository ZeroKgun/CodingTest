import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> complete = new ArrayList<>();
        Queue<Integer> que = new ArrayDeque<>();
        
        for(int i =0; i<progresses.length; i++){
            int left = 100 - progresses[i];
            int days = left / speeds[i];
            if((left % speeds[i]) > 0) days++;
            
            que.add(days);
        }
        
        while(!que.isEmpty()){
            int max = que.remove();
            int cnt = 1;
            while(!que.isEmpty() && max >= que.peek()){
                que.remove();
                cnt++;
            }
            complete.add(cnt);
        }
        answer = new int[complete.size()];
        for(int i=0; i<answer.length ; i++){
            answer[i] = complete.get(i);
        }
        return answer;
    }
}

// 7 , 3 , 9
// 5 10 1 1 20 1
