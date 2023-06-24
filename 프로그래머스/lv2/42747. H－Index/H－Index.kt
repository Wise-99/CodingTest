class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        
        // 오름차순 정렬
        citations.sort()
        
        for(i in 0 until citations.size){
            if(citations[i] >= citations.size - i){
                answer ++
            }
        }
        
        return answer
    }
}