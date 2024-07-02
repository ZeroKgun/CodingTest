import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> limit = new ArrayList<>();
        
        ArrayList<Integer> honor = new ArrayList<>();
        
        int minScore = Integer.MAX_VALUE;
        
        for(int i=0; i<score.length; i++){
            if(honor.size()<k){
                honor.add(score[i]);
            }
            else{
                if(honor.get(honor.size()-1) < score[i]){
                    honor.remove(honor.size()-1);
                    honor.add(score[i]);
                }
            }
            Collections.sort(honor, Collections.reverseOrder());
            answer[i] = honor.get(honor.size()-1);
        }
        return answer;
    }
}