import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int xlen = dots[0][0];
        int ylen = dots[0][1];
        
        for(int i=1; i<dots.length; i++){
            if(xlen != dots[i][0]){
                xlen = Math.abs(xlen - dots[i][0]);
                break;
            }
        }
        System.out.println(xlen);
        
        for(int i=1; i<dots.length; i++){
            if(ylen != dots[i][1]){
                ylen = Math.abs(ylen - dots[i][1]);
                break;
            }
        }
        
        answer = xlen * ylen;
        
        return answer;
    }
}