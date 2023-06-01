class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        
        for(c in s.toCharArray()){
            // 소문자
            if(c >= 'a' && c <= 'z'){
                // c + n이 'z'를 넘지 않는다면 0을, 아니면 26을 빼준다
                answer += (c + n - (if (c + n <= 'z') 0 else 26)).toChar()
                
            // 대문자
            }else if(c >= 'A' && c <= 'Z'){
                answer += (c + n - (if (c + n <= 'Z') 0 else 26)).toChar()
            
            // 공백은 그대로 추가
            }else{
                answer += c
            }
        }
        
        return answer
    }
}