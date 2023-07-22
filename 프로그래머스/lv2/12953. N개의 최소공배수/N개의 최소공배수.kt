class Solution {
    fun solution(arr: IntArray): Int {
        var answer = 0
        
        // 첫번째 두번째 숫자끼리의 최소공배수
        var temp = lcm(arr[0], arr[1])
        
        // 순차적으로 temp와 최소공배수를 구한다.
        for(i in 2 until arr.size){
            temp = lcm(temp, arr[i])
        }
        
        return temp
    }
    
    // 최대공약수
    fun gcd(a : Int, b : Int) : Int{
        var num1 = a
        var num2 = b
        
        while(num2 != 0){
            var r = num1 % num2
            num1 = num2
            num2 = r
	    }
        return num1
    }
    
    // 최소공배수
    fun lcm(num1 : Int, num2 : Int) : Int{
        return num1 * num2 / gcd(num1, num2);
    }
}