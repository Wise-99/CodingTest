import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 수의 갯수
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0; i<num; i++){
            int money = sc.nextInt();
            if(money == 0){ // 받은 정수가 0이면 최근 정수 제거
                stack.pop();
            } else {
                stack.push(money); // 받은 정수가 0이 아니면 받은 정수 추가
            }
        }
        
        int sum = 0; // 합을 구할 변수
        for(int i : stack)
            sum += i;
        
        System.out.println(sum); // 출력
    }
}