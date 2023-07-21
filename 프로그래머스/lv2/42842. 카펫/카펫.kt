class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var total = brown + yellow
        var answer = intArrayOf(3, 3)

        (3..total / 3).forEach { height ->
            var width = total / height

            if ((height - 2) * (width - 2) == yellow) {
                return intArrayOf(width, height)
            }
        }

        return answer
    }
}