class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i<babbling.length; i++){
            String str = babbling[i];
            for(int j=0; j<4; j++){
                // String talk = word[j];
                if(str.contains(word[j])){
                    str = str.replace(word[j]," ");
                }
            }
            if(str.trim().isEmpty()) answer++;
        }
        return answer;
    }
}