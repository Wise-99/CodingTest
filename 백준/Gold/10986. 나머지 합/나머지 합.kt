import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val N = nextInt() // 숫자의 개수
    val M = nextInt() // 나눌 수
    val reminder = IntArray(M)
    
    // 첫 구간 합은 0
    var sum = 0
    
    // 구간 합 계산
    for(i in 1 .. N){
        sum += nextInt() % M
        reminder[sum % M]++
    }
    
    var answer = reminder[0].toLong()
    for(i in 0 until M){
        val cnt = reminder[i]
        answer += cnt.toLong() * (cnt - 1) / 2
    }
    
    println(answer)
}