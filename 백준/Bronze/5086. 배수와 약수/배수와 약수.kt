import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    while(true){
        val num1 = nextInt()
        val num2 = nextInt()
        
        if(num1 == 0 && num2 == 0){
            break
        }
        
        if(num1 > num2){
            if(num1 % num2 == 0){
                println("multiple")
            } else {
                println("neither")
            }
        }
        
        else {
            if(num2 % num1 == 0){
                println("factor")
            }
            else {
                println("neither")
            }
        }
    }
}