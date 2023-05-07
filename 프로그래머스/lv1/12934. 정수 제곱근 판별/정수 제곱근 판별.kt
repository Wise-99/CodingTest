import kotlin.math.*

class Solution {
    fun solution(n: Long): Long {
        val sqrt = sqrt(n.toDouble())
        
        if(sqrt % 1.0 == 0.0){
            return (sqrt + 1).pow(2.0).toLong()
        } else {
            return -1
        }
        
    }
}