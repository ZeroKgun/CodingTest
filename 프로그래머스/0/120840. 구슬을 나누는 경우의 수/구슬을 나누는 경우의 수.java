import java.util.*;

class Solution {
    public int solution(int balls, int share) {
        int answer = 1;
        long tmp = 1;
        for(int i = 0; i<share; i++){
            tmp = tmp * (balls -i)/(i+1);
        }
        answer = (int) tmp;
        return answer;
    }
}