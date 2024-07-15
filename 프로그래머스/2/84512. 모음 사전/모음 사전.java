import java.util.*;

class Solution {
    
    static char[] words = {'A','E','I','O','U'};
    static ArrayList<String> allwords;
    
    public int solution(String word) {
        
        allwords = new ArrayList<>();
        dfs("");
        for(int i =0; i<allwords.size(); i++){
            if(allwords.get(i).equals(word)){
                return i;
            }
        }
        int answer = 0;
        return answer;
    }
    
    public void dfs(String tmp){
        
        if(tmp.length()==5){
            if(!allwords.contains(tmp)) allwords.add(tmp);
            return;
        }
        
        if(!allwords.contains(tmp)) allwords.add(tmp);
        
        for(int i = 0; i<words.length; i++){
            dfs(tmp+words[i]);
        }
    }
}