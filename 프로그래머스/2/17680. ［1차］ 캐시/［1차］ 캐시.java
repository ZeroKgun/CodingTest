import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        Queue<String> cache = new LinkedList<>();
        
        for(int i = 0; i<cities.length; i++){
            cities[i] = cities[i].toLowerCase();
        }
        if(cacheSize == 0){
            return cities.length * 5;
        }
        for(int i = 0; i<cities.length; i++){
            if(cache.contains(cities[i])){ //hit
                // if(cache.size() == cacheSize){
                //     cache.remove(cities[i]);
                // }
                cache.remove(cities[i]);
                cache.offer(cities[i]);
                answer += 1;
            }
            else{
                if(cache.size() == cacheSize){
                    cache.poll();
                }
                cache.offer(cities[i]);
                answer += 5;
            }
        }
        return answer;
    }
}


//캐시 히트 -> 캐시 안에 찾는 데이터가 있는 경우 +1
//캐시 히트의 경우 찾은 데이터를 빼주고, 뒤에 붙임
//캐시 미스 -> 캐시 안에 찾는 데이터가 없는 경우 +5
//캐시크기가 남았다 => 뒤에 붙임
//캐시 크기가 꽉찼다 => 앞에꺼 빼고 뒤에 붙임
//큐로 구현하자.