class Solution {
    fun solution(numbers: IntArray): Int {
        var total: Int = 0
        
        for(i : Int in 0..9){
            total += i
        }
        
        val sum = numbers.sum()
        
        return total - sum
    }
}