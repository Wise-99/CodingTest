import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] number = new int[31];
        int success = 0;
        for(int i=1; i < 29; i++){
             success = sc.nextInt();
            number[success] = 1;
        }
        
        for(int i=1; i < number.length; i++){
            if(number[i] != 1)
                System.out.println(i);
        }
        
        
    }
}