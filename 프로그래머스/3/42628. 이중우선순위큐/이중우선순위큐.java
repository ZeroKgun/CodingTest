import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        String[] op;
        
        for(int i =0; i<operations.length; i++){
            op = operations[i].split(" ");
            int num = Integer.parseInt(op[1]);
            if(op[0].equals("I")){
                minQ.add(num);
                maxQ.add(num);
            }
            else if(op[0].equals("D")){
                if(num == -1){
                    if(!minQ.isEmpty()){
                        int tmp = minQ.remove();
                        maxQ.remove(tmp);
                    }
                }
                else if(num == 1){
                    if(!maxQ.isEmpty()){
                        int tmp = maxQ.remove();
                        minQ.remove(tmp);
                    }
                }
            }
        }
        if(!minQ.isEmpty() && !maxQ.isEmpty()){
            answer[0] = maxQ.remove();
            answer[1] = minQ.remove();
        }
        return answer;
    }
}