import java.util.*;

class Solution {
    
    boolean[] visited;
    ArrayList<String> result = new ArrayList<String>();
    
    
    public void dfs(String depart, String path, String[][] tickets, int cnt){
        if(cnt == tickets.length){
            result.add(path);
            return;
        }
        
        for(int i = 0; i<tickets.length; i++){
            if(tickets[i][0].equals(depart) && visited[i] == false){
                visited[i] = true;
                dfs(tickets[i][1], path + " " + tickets[i][1], tickets, cnt + 1);
                visited[i] = false;
            }
        }
    }
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        
        visited = new boolean[tickets.length];
        dfs("ICN", "ICN", tickets, 0);
        Collections.sort(result);
        answer = result.get(0).split(" ");
        return answer;
    }
}