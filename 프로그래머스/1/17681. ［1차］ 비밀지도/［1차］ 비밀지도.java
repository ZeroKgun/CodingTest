import java.util.*;

class Solution {
    
    public String change2(int num, int n){
        
        StringBuilder sb = new StringBuilder();
        while(num >0){
            int r = num % 2;
            if(r == 1) sb.append("#");
            else sb.append(" ");
            num = num / 2;
        }
        while(sb.length() < n){
            sb.append(" ");
        }
        return sb.reverse().toString();
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb;
        
        for(int i = 0; i<n; i++){
            String one = change2(arr1[i],n);
            String two = change2(arr2[i],n);
            sb = new StringBuilder();
            for(int j = 0; j<n; j++){
                if(one.charAt(j) == ' ' && two.charAt(j) == ' '){
                    sb.append(" ");
                }
                else{
                    sb.append("#");
                }
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}