class Solution {
    fun solution(before: String, after: String): Int {
        var answer: Int = 1
        
        var beforeList = before.toCharArray()
        var afterList = after.toCharArray()
        beforeList.sort()
        afterList.sort()
        
        for(i in 0..(beforeList.size)-1){
            if(beforeList[i] != afterList[i]){
                answer = 0
                break
            }
        }
        
        return answer
    }
}