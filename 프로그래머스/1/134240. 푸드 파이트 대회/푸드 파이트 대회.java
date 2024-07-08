class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i<food.length; i++){
            if(food[i] >= 2){
                for(int j=0;j<food[i]/2;j++){
                    answer += i;
                }
            }
        }
        String back = sb.append(answer).reverse().toString();
        answer += "0";
        answer += back;
        return answer;
    }
}