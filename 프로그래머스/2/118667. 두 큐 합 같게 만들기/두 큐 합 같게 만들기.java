import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -1;
        int cnt = 0;
        long sum1 = Arrays.stream(queue1).sum();
        long sum2 = Arrays.stream(queue2).sum();
        long total = sum1 + sum2;
        long smallT = 0;
        int size = queue1.length;
        
        if(total % 2 != 0) return answer;
        
        Queue<Integer> small = new ArrayDeque<>();
        Queue<Integer> big = new ArrayDeque<>();
        if(sum1<sum2){
            for(int num: queue1){
                small.add(num);
            }
            for(int num: queue2){
                big.add(num);
            }
            smallT = sum1;
        }
        else{
            for(int num: queue2){
                small.add(num);
            }
            for(int num: queue1){
                big.add(num);
            }
            smallT = sum2;
        }
        
        while(cnt<=4*size){
            if(small.isEmpty()){
                int tmp = big.remove();
                small.add(tmp);
                smallT = smallT + tmp;
                cnt++;
            }
            else if(big.isEmpty()){
                int tmp = small.remove();
                big.add(tmp);
                smallT = smallT - tmp;
                cnt++;
            }
            if(smallT < total/2){
                int tmp = big.remove();
                small.add(tmp);
                smallT = smallT + tmp;
                cnt++;
            }
            if(smallT > total/2){
                int tmp = small.remove();
                big.add(tmp);
                smallT = smallT - tmp;
                cnt++;
            }
            if(smallT == total / 2){
                answer = cnt;
                break;
            }
        }
        
        return answer;
    }
}