class Solution {
    fun solution(A: String, B: String): Int {
        var answer: Int = -1
        var temp = A
        
        for(i in 0 until A.length){
            if(temp == B){
                answer = i
                break
            }
            temp = temp.substring(temp.length-1) + temp.substring(0, temp.length-1)
        }
        
        return answer
    }
}