class Solution {
    
    int[] numbers;
    int target;
    int answer = 0;
    
    public void dfs(int idx, int sum){
        
        if(idx == numbers.length){
            if(sum == target){
                answer++;
                
            }
            return;
        }
        
        dfs(idx+1, sum + numbers[idx]);
        dfs(idx+1, sum - numbers[idx]);
    }
    
    
    public int solution(int[] numbers, int target) {
        
        this.numbers = numbers;
        this.target = target;
        dfs(0,0);
        return answer;
    }
}