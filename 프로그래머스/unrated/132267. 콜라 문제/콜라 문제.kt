class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var copy = n // n은 val 변수이므로 사용하기 위해 copy
        
        while(copy >= a){
            var bottle = copy % a  // 교환하고 남는 콜라의 수
            copy =  (copy / a) * b // 새로 받는 콜라의 수
            answer += copy         // 합산
            
            copy += bottle         // 새로 받은 콜라의 수 + 남은 콜라의 수 합산
        }
        
        return answer
    }
}