import java.util.*;

public class Main{
    public static void main(String[] args){
        int num = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        for(int i=1; i <= 9; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}