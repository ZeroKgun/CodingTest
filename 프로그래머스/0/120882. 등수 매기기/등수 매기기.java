import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        HashMap<Double, Integer> avgmap = new HashMap<>();
        ArrayList<Double> rank = new ArrayList<>();
        
        for(int[] s : score){
            double avg = (s[0] + s[1])/2.0;
            
            avgmap.put(avg, avgmap.getOrDefault(avg,0)+1);
            if(!rank.contains(avg)){
                rank.add(avg);
            }
        }
        
        Collections.sort(rank, Collections.reverseOrder());
        // System.out.println(rank);
        int r = 1;
        for(int i = 0; i<rank.size(); i++){
            double cur = rank.get(i);
            int num = avgmap.get(cur);
            avgmap.put(cur, r);
            r = r + num;
        }
        
        for(int i = 0; i<answer.length; i++){
            double tmp = (score[i][0] + score[i][1]) / 2.0;
            int a = avgmap.get(tmp);
            answer[i] = a;
        }
        return answer;
    }
}