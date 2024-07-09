class Solution {
    public long[] solution(int n, long left, long right) {
        
        long[] answer = new long[(int)(right-left+1)];
        
        int idx = 0;
        
        for(int i = 0; i<answer.length; i++){
            
            long tmp = Math.max((left/n) , (left%n)) + 1;
            answer[i] = tmp;
            
            left++;
        }
        
        return answer;
    }
}