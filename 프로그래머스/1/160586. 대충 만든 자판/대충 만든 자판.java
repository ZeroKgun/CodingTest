import java.util.*;


class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int sum = 0;
        int flag = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int[] answer = new int[targets.length];
        for(String key : keymap){
            for(int i = 0; i<key.length();i++){
                char tmp = key.charAt(i);
                if(map.containsKey(tmp)){
                    map.put(tmp, Math.min(map.get(tmp),i+1));
                }
                else{
                    map.put(tmp, i+1);
                }
            }
        }
        for(int i = 0; i<targets.length;i++){
            sum = 0;
            flag = 0;
            for(int j =0; j<targets[i].length();j++){
                if(map.containsKey(targets[i].charAt(j))){
                    sum = sum + map.get(targets[i].charAt(j));
                    flag++;
                }
            }
            if(flag<targets[i].length()) {answer[i] = -1;}
            else {answer[i] = sum;}
        }
        
        return answer;
    }
}