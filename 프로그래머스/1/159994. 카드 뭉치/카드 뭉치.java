import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        int check=0;
        int idx1 = 0;
        int idx2 = 0;
//         Queue<String> q1 = new LinkedList<>();
//         Queue<String> q2 = new LinkedList<>();
        
//         for(String card: cards1){
//             q1.offer(card);
//         }
//         for(String card: cards2){
//             q2.offer(card);
//         }
        
        for(String target : goal){
            if(idx1< cards1.length && target.equals(cards1[idx1])){
                idx1++;
                check++;
            }
            else if(idx2< cards2.length && target.equals(cards2[idx2])){
                idx2++;
                check++;
            }
        }
        
        if(check == goal.length) answer = "Yes";
        
        return answer;
    }
}