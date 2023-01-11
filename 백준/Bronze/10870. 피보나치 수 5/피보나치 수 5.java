import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int[] number = new int[num+1];
        
        for(int i=0; i<=num; i++){
            if(i == 0) number[i] = 0;
            else if(i == 1) number[i] = 1;
            else number[i] = number[i-1] + number[i-2];
        }
        
        System.out.println(number[num]);
    }
}