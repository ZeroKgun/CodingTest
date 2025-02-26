import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int x = 0;
        int y = 0;
        int limitG = board[0] / 2;
        int limitS = board[1] / 2;
        
        for(String input : keyinput){
            if(input.equals("left")){
                if(x> -1*limitG){
                    x--;
                }
            }
            else if(input.equals("right")){
                if(x<limitG){
                    x++;
                }
            }
            else if(input.equals("down")){
                if(y> -1*limitS){
                    y--;
                }
            }
            else{
                if(y<limitS){
                    y++;
                }
            }
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}