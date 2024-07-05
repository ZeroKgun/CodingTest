class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int idx = (s.length()-1)/2;
        if(s.length() % 2 != 0){
            return sb.append(s.charAt(idx)).toString();
        }
        else{
            return sb.append(s.charAt(idx)).append(s.charAt(idx+1)).toString();
        }
        // return answer;
    }
}