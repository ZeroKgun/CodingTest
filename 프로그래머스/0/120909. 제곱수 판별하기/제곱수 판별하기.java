class Solution {
    public int solution(int n) {
        int answer = 2;
        int t = 2;
        while(t*t <= n){
            if(t*t == n) return 1;
            t = t+1;
        }
        return answer;
    }
}