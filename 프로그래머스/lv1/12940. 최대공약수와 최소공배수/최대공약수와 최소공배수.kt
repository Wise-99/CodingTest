class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf(0,0)
        
        answer[0] =  gcd(n, m)
        answer[1] = n * m / answer[0]
        
        return answer
    }
    
    // 유클리드 호제법
    fun gcd(a:Int, b:Int) : Int{
        if (b == 0) {
            return a
        }
        return gcd(b , a % b)
    }
}