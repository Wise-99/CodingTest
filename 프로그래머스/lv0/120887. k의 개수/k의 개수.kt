class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        var numString = ""
        
        for(num in i..j){
            numString += num.toString()
        }
        
        return numString.count { it == Integer.toString(k)[0] }
    }
}