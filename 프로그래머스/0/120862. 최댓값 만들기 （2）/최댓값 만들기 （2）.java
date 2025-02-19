import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int len = numbers.length;
        int p1 = numbers[len-2];
        int p2 = numbers[len-1];
        
        int n1 = numbers[0];
        int n2 = numbers[1];
        
        answer = p1*p2 > n1*n2 ? p1*p2 : n1 * n2;
        return answer;
    }
}