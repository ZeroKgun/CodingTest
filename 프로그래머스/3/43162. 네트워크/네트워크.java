import java.util.*;

class Solution {
    static Map<Integer, List<Integer>> network = new HashMap<>();
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        for(int i = 0; i<computers.length; i++){
            network.put(i, new ArrayList<>());
        }
        for(int i = 0; i<computers.length ; i++){
            for(int j=0; j<computers[i].length ; j++){
                if(i==j) continue;
                if(computers[i][j] == 1){
                    network.get(i).add(j);
                }
            }
        }
        for(int i = 0; i<visited.length; i++){
            if(visited[i] == false){
                dfs(i);
                answer++;
            }
        }
        
        return answer;
    }
    
    public static void dfs(int start){
        visited[start] = true;
        
        for(Integer next : network.get(start)){
            if(!visited[next]){
                dfs(next);
            }
        }
    }
}