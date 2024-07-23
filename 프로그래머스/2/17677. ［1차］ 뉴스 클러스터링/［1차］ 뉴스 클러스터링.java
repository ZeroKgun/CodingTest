import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        if(str1.equals(str2)) return 65536;
        
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        
        for(int i=0; i<str1.length()-1; i++){
            StringBuilder sb = new StringBuilder();
            String tmp = "";
            if(Character.isLetter(str1.charAt(i)) && Character.isLetter(str1.charAt(i+1))){
                sb.append(str1.charAt(i)).append(str1.charAt(i+1));
                tmp = sb.toString();
                map1.put(tmp, map1.getOrDefault(tmp,0) + 1);
            }
        }
        for(int i=0; i<str2.length()-1; i++){
            StringBuilder sb = new StringBuilder();
            String tmp = "";
            if(Character.isLetter(str2.charAt(i)) && Character.isLetter(str2.charAt(i+1))){
                sb.append(str2.charAt(i)).append(str2.charAt(i+1));
                tmp = sb.toString();
                map2.put(tmp, map2.getOrDefault(tmp,0) + 1);
            }
        }
        
        
        int j1 = 0;
        int j2 = 0;
        HashSet<String> allKey = new HashSet<>();
        for(String str: map1.keySet()){
            allKey.add(str);
        }
        for(String str: map2.keySet()){
            allKey.add(str);
        }
        
        for(String str: allKey){
            if(map1.containsKey(str) && map2.containsKey(str)){
                int min = Math.min(map1.get(str) , map2.get(str));
                int max = Math.max(map1.get(str), map2.get(str));
                j1 += min;
                j2 += max;
            }
            else{
                int max = Math.max(map1.getOrDefault(str,0), map2.getOrDefault(str,0));
                j2 += max;
            }
            
        }
        
        answer = (int)(((double)j1/j2) * 65536);
        
        
        return answer;
    }
}