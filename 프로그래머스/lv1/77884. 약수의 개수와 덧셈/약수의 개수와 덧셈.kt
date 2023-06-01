class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        
        // left부터 right까지의 수
        for(i in left .. right){
            var temp = 0
            
            // i의 약수 찾기
            for(j in 1 .. i){
                if(i % j == 0){
                    temp ++
                }
            }
            // 약수의 개수가 짝수면 +, 아니면 -
            answer += if(temp % 2 == 0) i else (-i)
        }
        
        return answer
    }
}