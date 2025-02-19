import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] charArray = my_string.toCharArray();
        char t1 = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = t1;
        answer = new String(charArray);
        return answer;
    }
}