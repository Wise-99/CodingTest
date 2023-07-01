import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var a1 = nextInt() // 분자1
    var b1 = nextInt() // 분모1
    
    var a2 = nextInt() // 분자2
    var b2 = nextInt() // 분모2
    
    var numerator = a1 * b2 + a2 * b1
    var denominator = b1 * b2
    
    var mod = gcd(numerator, denominator)
    
    print("${numerator / mod} ${denominator / mod}")
}

// 유클리드 호제법
fun gcd(a:Int, b:Int) : Int{
    if (b == 0) {
            return a
        }
        return gcd(b , a % b)
}