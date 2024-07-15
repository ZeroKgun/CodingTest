class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        boolean canSpeak = true;
        String[] talk = {"aya", "ye", "woo", "ma"};
        
        for(String target : babbling){
            canSpeak = true;
            
            for(String t : talk){
                String t2 = t+t;
                if(target.contains(t2)){
                    canSpeak = false;
                    break;
                }
            }
            
           if(canSpeak){
                for(String t : talk){
                    while(target.contains(t)){
                        target = target.replaceFirst(t, " ");
                    }
                }
               target = target.replaceAll(" ","");
            }
            
            if(target.equals("")) answer++;
            
        }
        
        
        return answer;
    }
}