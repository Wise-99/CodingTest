import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        if(year%4 == 0 && year%100 != 0){ // 윤년
            System.out.println(1);
        } else if(year%400 == 0) { // 윤년
            System.out.println(1);
        } else { // 윤년이 아님
            System.out.println(0);
        }
    }
}