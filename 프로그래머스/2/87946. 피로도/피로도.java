import java.util.*;

class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = Integer.MIN_VALUE;
        
        List<List<Integer>> order = new ArrayList<>();
        boolean[] visited = new boolean[dungeons.length];
        boolean ok = true;
        
        permutation(new ArrayList<>(), dungeons.length, visited, order);
        
        for(List<Integer> o : order){
            int tmp = k;
            int size = 0;
            for(int i = 0; i<o.size(); i++){
                int dunNum = o.get(i);
                if(tmp<dungeons[dunNum][0]){
                    ok = false;
                    break;
                }
                size++;
                tmp = tmp - dungeons[dunNum][1];
            }
            answer = Math.max(size,answer);
            ok = true;
        }
        
        return answer;
    }
    
    public void permutation(List<Integer> curr,int n, boolean[] visited, List<List<Integer>> order){
        
        if(curr.size() == n){
            order.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i = 0 ; i<n; i++){
            if(visited[i]) continue;
            
            visited[i] = true;
            curr.add(i);
            permutation(curr, n, visited, order);
            visited[i] = false;
            curr.remove(curr.size()-1);
        }
    }
}