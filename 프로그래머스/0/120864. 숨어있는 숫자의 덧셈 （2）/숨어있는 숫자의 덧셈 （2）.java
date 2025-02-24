import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.toUpperCase();
        my_string = my_string.replaceAll("[A-Z]"," ");
        String[] tmp = my_string.split(" ");
        for(String num : tmp){
            if(!num.isEmpty()) {  // 빈 문자열 체크
                answer += Integer.valueOf(num);
            }
        }
        return answer;
    }
}