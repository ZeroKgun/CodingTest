import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String tmp = "";
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("zero", 0);
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine", 9);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                sb.append(c);
            }
            else{
                tmp += c;
                if(numbers.containsKey(tmp)){
                    sb.append(numbers.get(tmp));
                    tmp = "";
                }
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
}