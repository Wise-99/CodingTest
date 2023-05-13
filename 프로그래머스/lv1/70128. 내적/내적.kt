class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0
        
        for(i in 0..(a.size)-1){
            answer += a[i] * b[i]
        }
        
        return answer
    }
}