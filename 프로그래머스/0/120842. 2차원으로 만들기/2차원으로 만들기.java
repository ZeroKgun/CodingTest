import java.util.*;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int len = num_list.length;
        int x = len/n;
        int[][] answer = new int[x][n];
        
        for(int i = 0; i<x; i++){
            for(int j = 0; j< n; j++){
                answer[i][j] = num_list[i*n + j];
            }
        }
        return answer;
    }
}