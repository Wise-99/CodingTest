class Solution {
    fun solution(s: String): String {
        var answer = ""
        var words = s.toLowerCase().toCharArray() // s를 모두 소문자로 바꾼 후 char형 array로 변환
        var idx = -1 // 인덱스를 셀 변수
        
        for(i in 0 until words.size){
            
            if(words[i] == ' '){ // i번째 글자가 공백이라면
                answer += " "    // answer에도 공백 추가
                idx = -1         // 인덱스는 -1
                
            } else {            // 공백이 아니면
                idx += 1        // 인덱스는 공백이 나올 때까지 1씩 더해짐(0부터 시작)
                
                if(idx % 2 == 0){ // 인덱스가 짝수라면 대문자로 변환
                answer += words[i].toUpperCase().toString()
                } else { // 홀수라면 소문자 그대로 answer에 추가
                    answer += words[i]
                }
            }
        }
        
        return answer
    }
}