import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashSet<String> wordSet = new HashSet<>();
        wordSet.add(words[0]);
        for(int i = 1; i<words.length; i++){
            String tmp = words[i-1].substring(words[i-1].length()-1);
            if(!words[i].startsWith(tmp)){
                answer[0] = i%n + 1;
                answer[1] = i/n + 1;
                break;
            }
            else{
                if(wordSet.contains(words[i])){
                    answer[0] = i%n + 1;
                    answer[1] = i/n + 1;
                    break;
                }
            }
            wordSet.add(words[i]);
        }
       
        return answer;
    }
}