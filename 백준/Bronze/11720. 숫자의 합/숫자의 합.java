import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        String numbers = sc.next();
        String[] number = numbers.split("");
        int answer = 0;
        
        for(int i=0; i<number.length; i++){
            answer += Integer.parseInt(number[i]);
        }
        
        System.out.println(answer);
    }
}