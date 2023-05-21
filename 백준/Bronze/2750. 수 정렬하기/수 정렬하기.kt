import java.util.Scanner;

fun main(){
    val sc = Scanner(System.`in`)
    val num = sc.nextInt()
    val number = IntArray(num)
        
    for(i in 0 until num){
        number[i] = sc.nextInt()
    }
        
    number.sort()
        
    for(i in 0 until num){
        println(number[i])
    }
}