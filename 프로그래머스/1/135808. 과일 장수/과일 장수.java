import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        // for(int num: score){
        //     System.out.print(num + " ");
        // }
        // System.out.println();
        
        
        if(m > score.length) return answer;
        
        for(int i = score.length-m; i>=0; i = i - m){
            // System.out.println(score[i]);
            answer += score[i] * m;
        }
        
        return answer;
    }
}