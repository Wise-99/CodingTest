class Solution {
    fun solution(common: IntArray): Int {
        val num1 = common[1] - common[0]
        val num2 = common[2] - common[1]
        
        if(num1 == num2){
            return common.last() + num1
        }
        else {
            return common.last() * (num2 / num1)
        }
    }
}