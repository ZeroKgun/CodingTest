class Solution {
    
    int n;
    int[][] computers;
    boolean[] visited;
    int[][] network;
    
    public void dfs(int idx){
        visited[idx] = true;
        for(int i =0; i<n; i++){
            if(idx != i){
                if(visited[i] == false && network[idx][i] == 1){
                    dfs(i);   
                }
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        
        int answer = 0;
        this.n = n;
        this.network = computers;
        visited = new boolean[computers[0].length];
        
        for(int i = 0; i<n ; i++){
            if(visited[i] == false){
                dfs(i);
                answer++;
            }
        }
        return answer;
    }
}