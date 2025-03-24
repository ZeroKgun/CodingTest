import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        HashMap<String, String> map = new HashMap<>();
        
        map.put(id_pw[0], id_pw[1]);
        
        for(String[] s : db){
            String id = s[0];
            String pwd = s[1];
            
            if(map.containsKey(id)){
                if(map.get(id).equals(pwd)){
                    answer = "login";
                    break;
                }
                else{
                    answer = "wrong pw";
                    break;
                }
            }
        }
        return answer;
    }
}