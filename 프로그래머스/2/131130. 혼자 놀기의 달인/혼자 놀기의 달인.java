import java.util.*;

class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        ArrayList<Integer> cnt = new ArrayList<>();
        int boxcnt = 0;
        boolean[] opened = new boolean[cards.length];
        
        
        for(int i = 0; i<cards.length; i++){
                if(opened[i] == false){
                    opened[i] = true;
                    boxcnt++;
                    int next = cards[i] - 1;
                    if(opened[next] == false){
                        while(!opened[next]){
                            opened[next] = true;
                            boxcnt++;
                            next = cards[next]-1;
                        }
                    }
                    if(boxcnt == cards.length) return 0;
                    cnt.add(boxcnt);
                    boxcnt = 0;
                }   
            }
        
        Collections.sort(cnt, (o1,o2)->(o2-o1));
        answer = cnt.get(0) * cnt.get(1);
        
        return answer;
    }
}