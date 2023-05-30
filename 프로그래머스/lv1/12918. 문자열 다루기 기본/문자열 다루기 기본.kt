class Solution {
    fun solution(s: String): Boolean {
        return s.toIntOrNull() != null && s.length in intArrayOf(4, 6)
    }
}