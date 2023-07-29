class Solution {
    fun solution(s: String): IntArray {
        var list = mutableListOf<Int>()
        
        for(i in 0 until s.length){
            // i까지의 단어 잘라내기
            val word = s.substring(0 until i)
            
            // 앞 단어에 i번째 글자가 있다면 index를 계산하여 저장
            if(word.contains(s[i])){
                list.add(i - word.lastIndexOf(s[i]))
            } else {
                list.add(-1) // 없으면 -1 저장
            }
        }
        
        return list.toIntArray()
    }
}