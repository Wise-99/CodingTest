class Solution {
    fun solution(bin1: String, bin2: String): String {
        var answer = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2)
        
        return Integer.toBinaryString(answer)
    }
}