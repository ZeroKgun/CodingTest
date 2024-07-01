class Solution {
    
    public int onecnt(int n){
        
        int cnt = 0;
        
        while(n>1){
            int r = n % 2;
            if(r == 1) cnt++;
            n = n/2;
        }
        return cnt;
    }
    
    
    public int solution(int n) {
        int answer = 0;
        int start = n+1;
        int origin = onecnt(n);
        while(true){
            int cnt = onecnt(start);
            if(cnt == origin){
                answer = start;
                break;
            }
            start++;
        }
        return answer;
    }
}