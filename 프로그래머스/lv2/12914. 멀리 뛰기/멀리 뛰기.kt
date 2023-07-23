class Solution {
    fun solution(n: Int): Long {
        var dp = LongArray(n+1)
        
        dp[0] = 1
        dp[1] = 1
        
        // n이 2보다 작으면 설정한 값을 그대로 리턴
        if(n<2) {
            return dp[n]
        }
        
        // n칸에 도달하는 방법의 갯수를 구함
        for(i in 2 ..n){
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567
        }
        
        return dp[n]
    }
}