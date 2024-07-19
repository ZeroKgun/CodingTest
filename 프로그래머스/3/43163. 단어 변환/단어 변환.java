import java.util.*;


class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = bfs(begin, target, words);
        return answer;
        
        
    }
    
    public int bfs(String begin, String target, String[] words){
        
        HashMap<String, Boolean> visited = new HashMap<>();
        Queue<Entry> que = new ArrayDeque<>();
        boolean hasTarget = false;
        
        for (String s : words){
            if(s.equals(target)) {
                hasTarget = true;
                break;
            }
        }
        if(!hasTarget) return 0;
        
        Entry start = new Entry(begin, 0);
        
        que.add(start);
        visited.put(start.str, true);
        
        while(!que.isEmpty()){
            Entry curr = que.remove();
            
            for(int i=0; i<words.length; i++){
                if(nextWord(curr.str,words[i])){
                    String nextStr = words[i];
                    if(nextStr.equals(target)){
                        return curr.cnt + 1;
                    }
                    else if(!visited.containsKey(nextStr)){
                        que.add(new Entry(nextStr, curr.cnt+1));
                        visited.put(nextStr, true);
                    }
                }
            }
        }
        return 0;
    }
    
    
    public boolean nextWord(String prev, String next){
        int cnt = 0;
        for(int i =0; i<prev.length(); i++){
            if(prev.charAt(i) != next.charAt(i)) cnt++;
        }
        if(cnt==1) return true;
        else return false;
    }
    
    static class Entry{
        String str;
        int cnt;
        
        public Entry(String s, int cntt){
            this.str = s;
            this.cnt = cntt;
        }
    }
}