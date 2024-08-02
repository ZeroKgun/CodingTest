import java.util.*;


class Solution {
    
    public int bfs(Map<Integer, List<Integer>> graph, int startVertex, int n){
        
        int maxDist = -1;
        int count = 0;
        
        boolean[] visited = new boolean[n+1];
        Queue<int []> que = new ArrayDeque<>();
        que.offer(new int[]{startVertex,0});
        visited[startVertex] = true;
        
        while(!que.isEmpty()){
            int[] curr = que.poll();
            int curVertex = curr[0];
            int dist = curr[1];
            
            if(maxDist<dist){
                maxDist = dist;
                count = 0;
            }
            count++;
            
            for(int nextVertex: graph.get(curVertex)){
                if(!visited[nextVertex]){
                    que.offer(new int[]{nextVertex,dist+1});
                    visited[nextVertex] = true;
                }
            }
        }
        
        return count;
    }
    public int solution(int n, int[][] edge) {
        
        //인접 리스트로 변환
        Map<Integer, List<Integer>> graph = new HashMap<>();
        
        for(int i=1; i<=n; i++){
            graph.put(i,new ArrayList<Integer>());
        }
        for(int i=0;i<edge.length; i++){
            int x = edge[i][0];
            int y = edge[i][1];
            
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        
        int answer = bfs(graph,1,n);
        
        return answer;
    }
}