import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        int len = numbers.length;
        int[] answer = new int[numbers.length];
        LinkedList<Integer> list = new LinkedList<>();
        
        if(direction.equals("right")){
            for(int i = 0 ; i<len-1 ; i++){
                list.add(numbers[i]);
            }
            list.addFirst(numbers[len-1]);
        }
        else{
            for(int i = 1; i<len; i++){
                list.add(numbers[i]);
            }
            list.add(numbers[0]);
        }
        for(int i = 0; i<len; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}