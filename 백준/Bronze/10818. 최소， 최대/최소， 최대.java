import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int min = 0;
        int max = 0;
        
        int[] number = new int[num];
        
        for(int i = 0; i < num; i++){
            number[i] = sc.nextInt();
        }
        min = max = number[0];
        
        for(int i=0; i < number.length; i++){
            if(min > number[i])
                min = number[i];
                
            if(max < number[i])
                max = number[i];
        }
        
        System.out.println(min + " " + max);
    }
}