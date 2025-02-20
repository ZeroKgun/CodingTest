import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] snum = new String[numbers.length];
        
        for(int i = 0; i<numbers.length; i++){
            snum[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(snum, (a,b)->(b+a).compareTo(a+b));
        if(snum[0].equals("0")) return "0";
        for(String s : snum){
            answer += s;
        }
        return answer;
    }
}