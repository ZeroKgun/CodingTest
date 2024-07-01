import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        String[] tmp = {}; //report[i] split 용 배열
        
        HashSet<String> reportSet = new HashSet<>();// report 중복제거
        
        HashMap<String, HashSet<String>> reportMap = new HashMap<>(); // 유저 ID, 신고한 ID
        
        HashMap<String, Integer> result = new HashMap<>(); // 유저 ID, 신고당한 횟수
        
        ArrayList<String> badboy = new ArrayList<>(); //정지 유저들
        
        for(String r : report){
            reportSet.add(r);
        } // report 중복제거
        
        for(String id : id_list){
            reportMap.put(id, new HashSet<String>());
            result.put(id, 0);
        }
        
        for(String r : reportSet){
            tmp = r.split(" ");
            reportMap.get(tmp[0]).add(tmp[1]);
            result.put(tmp[1], result.get(tmp[1]) + 1);
        }
        
        for(String key : result.keySet()){
            if(result.get(key) >= k){
                badboy.add(key);
            }
        }
        for(int i = 0; i< answer.length; i++){
            String name = id_list[i];
            int total = 0;
            for(String b : reportMap.get(name)){
                if(badboy.contains(b)) total += 1;
            }
            answer[i] = total;
        }
        return answer;
    }
}