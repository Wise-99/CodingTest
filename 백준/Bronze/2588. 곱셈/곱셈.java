import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        String num2 = sc.next();
        
        for(int i=num2.length()-1; i>=0; i--){
            // char to int 형변환
            System.out.println(num1 * Character.getNumericValue(num2.charAt(i)));
        }
        
        System.out.println(num1 * Integer.parseInt(num2));
    }
}