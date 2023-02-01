import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] number = new int[3];
        
        for(int i=0; i<number.length; i++){
            number[i] = sc.nextInt();
        }
        
        Arrays.sort(number);
        
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
}