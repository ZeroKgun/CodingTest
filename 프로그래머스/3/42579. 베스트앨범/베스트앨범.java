import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        //<장르, HashMap<곡 ID, 곡 재생횟수>
        HashMap<String, HashMap<Integer, Integer>> infomap = new HashMap<>();
        //<장르, 총 재생횟수>
        HashMap<String, Integer> totalplaymap = new HashMap<String, Integer>();
        
        // infomap의 초기화
        for(String genre : genres){
            infomap.put(genre, new HashMap<>());
        }
        
        // infomap 및 totalplaymap 값 대입
        //getOrDefault -> 키 값이 있다면 첫번째 인자를 반환, 없다면 default 값으로 설정해놓은 값을 반환
        for(int i = 0; i < genres.length ; i++){
            infomap.get(genres[i]).put(i, plays[i]);
            totalplaymap.put(genres[i], totalplaymap.getOrDefault(genres[i], 0) + plays[i]);
        }

        // totalplaymap을 이용하여 장르를 재생 횟수 기준 내림차순으로 정렬한 sortedGenres.
        // Map 구조는 정렬이 안되므로 list형태로 keyset을 받아 sort해준다.
        List<String> sortedGenres = new ArrayList<>(totalplaymap.keySet());
        sortedGenres.sort((a, b) -> totalplaymap.get(b) - totalplaymap.get(a));

        // 결과 리스트, answer
        List<Integer> resultList = new ArrayList<>();

        // 각 장르별로 곡 당 재생수로 다시 정렬
        for (String genre : sortedGenres) {
            List<Map.Entry<Integer, Integer>> songList = new ArrayList<>(infomap.get(genre).entrySet());
            songList.sort((a, b) -> b.getValue() - a.getValue());

            // 상위 2곡 선택
            int count = 0;
            for (Map.Entry<Integer, Integer> song : songList) {
                if (count == 2) break;
                resultList.add(song.getKey());
                count++;
            }
        }

        // 결과를 배열로 변환
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}
