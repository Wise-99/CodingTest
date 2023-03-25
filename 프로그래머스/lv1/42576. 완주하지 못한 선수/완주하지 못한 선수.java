import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        for(String p : participant){
            // 이름을 key 값으로 생성, 동명이인 있을 경우 value 1 증가
            map.put(p, map.getOrDefault(p, 0)+1);
        }
        
        for (String c : completion) {
            map.put(c, map.get(c) - 1); // 완주했을 경우 -1
        }
        
        // 0이 아닐 경우(완주하지 못했을 경우) key 값을 뽑아서 출력
        for (String key : map.keySet()) {
        if (map.get(key) != 0) {
            answer = key;
            break;
        }
    }
        
        return answer;
    }
}