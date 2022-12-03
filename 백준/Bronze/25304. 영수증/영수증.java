import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int num = sc.nextInt();
        int price = 0;
        int number = 0;
        int sum = 0;
        
        for(int i=1; i <= num; i++){
            price = sc.nextInt();
            number = sc.nextInt();
            sum += price * number;
        }
        
        if(sum == total)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}