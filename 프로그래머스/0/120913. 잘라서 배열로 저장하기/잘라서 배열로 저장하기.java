import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        int start = 0;
        ArrayList<String> list = new ArrayList<>();
        while(start<my_str.length()){
            String tmp ="";
            if(start + n < my_str.length()){
                tmp = my_str.substring(start, start+n);
            }
            else{
                tmp = my_str.substring(start);
            }
            list.add(tmp);
            start = start + n;
        }
        answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}