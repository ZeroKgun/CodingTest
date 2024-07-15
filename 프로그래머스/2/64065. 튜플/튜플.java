import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        s = s.substring(2, s.length() - 2);
        
        s = s.replaceAll("\\{", "");
        
        s = s.replaceAll("\\}", "");
        
        String[] arr = s.split(",");
        
        ArrayList<Integer> l = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i<arr.length; i++){
            int tmp = Integer.parseInt(arr[i]);
            map.put(tmp, map.getOrDefault(tmp,0)+1);
        }
        
        for(int num : map.keySet()){
            l.add(num);
        }
        Collections.sort(l,(n1,n2)->map.get(n2) - map.get(n1));
        answer = new int[l.size()];
        for(int i=0; i<l.size(); i++){
            answer[i] = l.get(i);
        }
        return answer;
    }
}