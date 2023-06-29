import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var cnt = 0        // 그룹 단어의 갯수
    
    // 입력한 단어의 수만큼 반복
    repeat(nextInt()){
        val word = next() // 체크할 단어
        
        for(i in 0 until word.length){
        
            if(i != word.length-1){ // 아래 if문에서 +1 때문에 생길 오류 방지
            
                if(word[i] == word[i+1]){ // 앞 글자와 같은 글자면 계속 확인
                    continue
                } 
                // 앞 단어에서 다시 나타나면 확인을 멈춤, 그룹단어가 아님
                else if(word[i] in word.substring(i + 1, word.length)){ 
                    break
                }
            }
            else {
                cnt++
            }
        }
    }
    
    print(cnt)
}