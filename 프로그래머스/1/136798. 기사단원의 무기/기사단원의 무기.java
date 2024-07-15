class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i<=number; i++){
            if(attack(i) <=limit) answer += attack(i);
            else answer += power;
        }
        return answer;
    }
    
    public int attack(int num){
        int a = 0;
        for(int i = 1; i<=Math.sqrt(num); i++){
            
            if(num%i==0){
              if(i == Math.sqrt(num)) a +=1;
                else a += 2;
            } 
        }
        return a;
    }
}