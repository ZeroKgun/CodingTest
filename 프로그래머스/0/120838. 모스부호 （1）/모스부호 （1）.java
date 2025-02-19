import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        HashMap<String, Character> al = new HashMap<>();
        al.put(".-", 'a');
        al.put("-...", 'b');
        al.put("-.-.", 'c');
        al.put("-..", 'd');
        al.put(".", 'e');
        al.put("..-.", 'f');
        al.put("--.", 'g'); 
        al.put("....", 'h');
        al.put("..", 'i');
        al.put(".---", 'j');
        al.put("-.-", 'k');
        al.put(".-..", 'l');
        al.put("--", 'm');
        al.put("-.", 'n');
        al.put("---", 'o');
        al.put(".--.", 'p');
        al.put("--.-", 'q');
        al.put(".-.", 'r');
        al.put("...", 's');
        al.put("-", 't');
        al.put("..-", 'u');
        al.put("...-", 'v');
        al.put(".--", 'w');
        al.put("-..-", 'x');
        al.put("-.--", 'y');
        al.put("--..", 'z');
        
        String[] password = letter.split(" ");
        for(int i = 0; i<password.length; i++){
            answer += al.get(password[i]);
        }
        return answer;
    }
}