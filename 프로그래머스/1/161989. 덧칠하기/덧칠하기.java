class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0]; //2
        int last = section[section.length - 1]; //6
        for(int i = 0 ; i<section.length ; i++){
            if(start <= section[i]){
                answer += 1;
                start = section[i] + m;
            }
        }
        return answer;
    }
}