import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 1;
        int fac = 1;
        while(n>fac*answer){
            answer++;
            fac = fac*answer;
        }
        return answer;
    }
}