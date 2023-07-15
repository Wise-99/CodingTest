class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer: IntArray = IntArray(numbers.size) { -1 }
        val stack = mutableListOf<Int>()
        
        var index = 0
        // 인덱스와 값을 사용한 for문
        for ((idx,num) in numbers.withIndex()) {
            
            while (index <= idx) {
                // stack의 맨 위의 값 구하기
                val stackTop = if (stack.isNotEmpty()) stack[stack.lastIndex] else -1

                // stack이 비어있거나 stack의 맨 위의 값에 해당하는 numbers의 값이 더 크다면
                if (stack.isEmpty() || num <= numbers[stackTop]) {
                    stack.add(index++)
                } else {
                    answer[stackTop] = num
                    stack.removeLast()
                }
            }
        }
        
        return answer
    }
}