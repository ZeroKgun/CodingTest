import java.util.*;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            int bottle = (n / a)*b;
            int left = n % a;
            answer += bottle;
            n = bottle + left;
        }
        return answer;
    }
}