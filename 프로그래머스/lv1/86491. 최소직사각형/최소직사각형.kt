import java.lang.Math

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        var fnlMax = 0
        var fnlMin = 0
        
        for(i in 0 until sizes.size){
            // 2차원 배열의 배열을 가져온다
            val size = sizes[i]
            
            // 두 개의 값 중 최댓값, 최솟값 구분
            val max = Math.max(size[0], size[1])
            val min = Math.min(size[0], size[1])
            
            // 현재 저장된 값 중 가장 큰 값과 비교
            fnlMax = Math.max(fnlMax, max)
            fnlMin = Math.max(fnlMin, min)
        }
        
        return fnlMax * fnlMin
    }
}