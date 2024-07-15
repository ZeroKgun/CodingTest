import java.util.*;

class Solution {
    static HashSet<String> uniqueSet;
    
    public int solution(String[][] relation) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        for(int i=0; i<relation[0].length; i++){
            backtrack(1, new StringBuilder(), relation[0].length, i+1, list);
        }
        uniqueSet = new HashSet<>();
        for(String str : list){
            if(isUnique(str, relation)){
                if(isMin(str)){
                    uniqueSet.add(str);
                }
            }
        }
        
        return uniqueSet.size();
    }
    
    public void backtrack(int start, StringBuilder path, int n, int k, List<String> list){
        
        if(path.length() == k){
            list.add(path.toString());
            return;
        }
        
        for(int i = start; i<=n ; i++){
            path.append(i);
            backtrack(i+1, path, n, k, list);
            path.deleteCharAt(path.length()-1);
        }
    }
    public boolean isUnique(String str, String[][] relation){
        HashSet<String> set = new HashSet<>();
        
       for(int i = 0; i < relation.length; i++){
            StringBuilder tmp = new StringBuilder();
            for(int j = 0; j < str.length(); j++){
                int idx = str.charAt(j) - '0';
                tmp.append(relation[i][idx-1]).append(",");
            }
            String tuple = tmp.toString();
            if(set.contains(tuple)) return false;
            set.add(tuple);
        }
        return true;
    }
    
    public boolean isMin(String str){
        for(String u : uniqueSet){
            int count = 0;
            for(int i = 0; i < u.length(); i++){
                if(str.indexOf(u.charAt(i)) != -1){
                    count++;
                }
            }
            if(count == u.length()){
                return false;
            }
        }
        return true;
    }
}