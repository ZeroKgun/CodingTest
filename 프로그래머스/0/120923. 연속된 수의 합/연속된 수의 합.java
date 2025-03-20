import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = total / num;
        int numT = num - 1;
        if(num % 2 != 0){
            for(int i = n - (numT)/2; i<=n+(numT)/2; i++){
                list.add(i);
            }
        }
        else{
            for(int i = n - (numT)/2; i<=n+(numT)/2+1; i++){
                list.add(i);
            }
        }
        
        answer = new int[list.size()];
        
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}