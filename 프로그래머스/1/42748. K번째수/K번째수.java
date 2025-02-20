import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int[] command: commands){
            int start = command[0]-1;
            int end = command[1]-1;
            int idx = command[2]-1;
            
            ArrayList<Integer> tmp = new ArrayList<>();
            for(int i = start; i<=end; i++){
                tmp.add(array[i]);
            }
            Collections.sort(tmp);
            result.add(tmp.get(idx));
        }
        int[] answer = new int[result.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}