class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(char c : arr){
            if(Character.isAlphabetic(c)){
                if(Character.isUpperCase(c)){
                    if(c+n >= 91){
                        c = (char)(c+n-26);
                    }
                    else{
                        c = (char)(c + n);
                    }
                }
                else{
                    if(c+n>=123){
                        c = (char)(c+n-26);
                    }
                    else{
                        c = (char)(c+n);
                    }
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}