class Solution {
    fun solution(s: String): String {
        var arr =s.split(" ").map{ it.toInt() }
        return "${arr.minOf{it}.toString()} ${arr.maxOf{it}.toString()}"
    }
}