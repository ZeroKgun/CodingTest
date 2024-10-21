import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int n = queue1.length;
        Queue<Integer> que1 = new ArrayDeque<>();
        Queue<Integer> que2 = new ArrayDeque<>();
        
        long sumOne = 0;
        long sumTwo = 0;
        int answer = 0;
        
        for(int i=0; i<queue1.length; i++){
            sumOne += queue1[i];
            sumTwo += queue2[i];
            que1.add(queue1[i]);
            que2.add(queue2[i]);
        }
        
        if((sumOne + sumTwo) % 2 == 1) return -1;
        // int target = (sumOne + sumTwo) / 2;
        
        for(int i=0; i< n * 4 ; i++){
            if (sumOne == sumTwo){
                return i;
            }
            else if(sumOne < sumTwo){
                int tmp = que2.poll();
                que1.add(tmp);
                sumOne += tmp;
                sumTwo -= tmp;
            }
            else {
                int tmp = que1.poll();
                que2.add(tmp);
                sumOne -= tmp;
                sumTwo += tmp;
            }
        }
        
        
        return -1;
    }
}