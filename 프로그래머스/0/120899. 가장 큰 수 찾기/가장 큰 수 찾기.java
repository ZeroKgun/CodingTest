import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        
        int max = array[0];
        answer[0] = max;
        
        for(int i = 1; i<array.length; i++){
            if(array[i] > max){
                answer[0] = array[i];
                answer[1] = i;
                max = array[i];
            }
        }
        
        return answer;
    }
}