import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int answer = 1;
        
        for(int i=2; i<=num; i++){
            answer += i;
        }
        
        System.out.println(answer);
    }
}