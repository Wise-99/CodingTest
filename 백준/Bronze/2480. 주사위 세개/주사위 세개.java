import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] num = new int[3]; 
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++){
            num[i] = sc.nextInt();
        }
        
        if(num[0] == num[1] && num[1] == num[2] && num[0] == num[2]){
            System.out.println(10000+(num[0]*1000));
        }
        else if(num[0] != num[1] && num[1] != num[2] && num[0] != num[2]){
            int max = num[0];
            for(int i= 0; i < num.length; i++){
                if(num[i] > max)
                    max = num[i];
                
            }
            System.out.println(max*100);
        }
        else{
            if(num[0] == num[1] || num[0] == num[2])
                System.out.println(num[0]*100+1000);
            else if(num[1] == num[2])
                System.out.println(num[1]*100+1000);
        }
    }
}