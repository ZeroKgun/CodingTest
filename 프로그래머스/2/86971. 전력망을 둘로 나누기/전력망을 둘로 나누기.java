import java.util.*;

class Solution {
    static int answer;
    
    public int solution(int n, int[][] wires) {
        int answer = n;
        
        Map<Integer, List<Integer>> graph = new HashMap<>();
        
        for(int i=1; i<=n; i++){
            graph.put(i, new ArrayList<>());
        }
        
        for(int i=0; i<wires.length; i++){
            int x = wires[i][0];
            int y = wires[i][1];
            
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        
        for(int[] wire : wires){
            int x = wire[0];
            int y = wire[1];
            
            graph.get(x).remove(Integer.valueOf(y));
            graph.get(y).remove(Integer.valueOf(x));
            
            int cnt1 = bfs(x,graph,n);
            int cnt2 = n - cnt1;
            
            graph.get(x).add(y);
            graph.get(y).add(x);
            
            int sub = Math.abs(cnt2 - cnt1);
            
            answer = Math.min(answer, sub);
        }
        return answer;
    }
    
    public int bfs(int start, Map<Integer,List<Integer>> graph, int n){
        Queue<Integer> que = new ArrayDeque<>();
        boolean[] visited = new boolean[n+1];
        
        int cnt=1;
        
        que.add(start);
        visited[start] = true;
        
        while(!que.isEmpty()){
            int curr = que.remove();
            
            for(int next : graph.get(curr)){
                if(!visited[next]){
                    que.add(next);
                    visited[next] = true;
                    cnt++;
                }
            }
        }
        return cnt;        
    }
}



//전체 노드 n, 한 망이 m개일 때 n-2m 절댓값