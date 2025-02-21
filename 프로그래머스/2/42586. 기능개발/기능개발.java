import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Deque<Integer> deque = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();
        int[] times = new int[progresses.length];
        int cnt = 0;
        int max = 0;
        
        for(int i=0; i<progresses.length; i++){
            
            int t = (100 - progresses[i]) / speeds[i];
            if((100-progresses[i])%speeds[i] > 0) t= t+1;
            times[i] = t;
        }
        
        for(int time: times){
            
            if(deque.isEmpty()) {
                deque.push(time);
                max = time;
            }
            else{
                if(time > max){
                    max = time;
                    while(!deque.isEmpty()){
                        deque.pop();
                        cnt++;
                    }
                    result.add(cnt);
                    cnt = 0;
                    deque.push(time);
                }
                else{
                    deque.push(time);
                }
            }
        }
        while(!deque.isEmpty()){
            deque.pop();
            cnt++;
        }
        result.add(cnt);
        int[] answer = new int[result.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}

//[7,3,9]
//[5,10,1,1,20]