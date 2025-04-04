class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n>=4){
            for(int i=4; i<=n; i++){
                if(!isPrime(i)) answer++;
            }
        }
        return answer;
    }
    
    
    public boolean isPrime(int n){
        if(n <= 3) return true;
        for(int i = 2; i*i<=n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}