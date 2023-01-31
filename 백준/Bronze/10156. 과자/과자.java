import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int price = sc.nextInt(); // 과자의 가격
        int num = sc.nextInt(); // 과자의 갯수
        int money = sc.nextInt(); // 가진 돈
        
        if(price*num <= money){ // 가지고 있는 돈이 과자의 가격보다 많거나 같으면
            System.out.println(0); // 0 출력
        } else { // 아니면 받아야 할 돈 계산 후 출력
            System.out.println((price*num) - money);
        }
    }
}