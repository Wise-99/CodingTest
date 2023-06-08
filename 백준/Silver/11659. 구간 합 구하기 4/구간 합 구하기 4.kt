import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val N = nextInt() // 숫자의 갯수
    val M = nextInt() // 반복 횟수
    val arr = IntArray(N+1)
    
    arr[0] = 0
    
    // 숫자 입력
    for(i in 1 .. N){
        arr[i] = arr[i-1] + nextInt()
    }
    
    // 주어진 구간의 합 계산
    for(k in 0 until M){
        // 구간 입력
        val i = nextInt()
        val j = nextInt()
        
        println(arr[j] - arr[i-1])
    }
}