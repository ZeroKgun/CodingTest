import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int num: array){
            sb.append(num);
        }
        String tmp = sb.toString();
        for(int i=0; i<tmp.length(); i++){
            char c = tmp.charAt(i);
            if(c == '7') answer++;
        }
        return answer;
    }
}