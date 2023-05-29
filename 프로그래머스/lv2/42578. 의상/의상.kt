class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 0
        val hashMap : HashMap<String, Int> = HashMap() // 의상 종류를 저장할 해시 맵
        
        for(cloth in clothes){
            // 해당 종류의 옷이 있을 경우 현재 가지 수 에서 1 증가
            // 만일 없을 경우 추가 후 안입는 경우도 고려하여 1을 추가
            hashMap[cloth[1]] = hashMap.getOrDefault(cloth[1],1) + 1
        }
        
        // 경우의 수 계산 (의상 종류1 * 의상 종류2 * ... 의상 종류n) - 1
        return hashMap.values.fold(1, {total, num -> total * num}) - 1
        
        return answer
    }
}