import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String words = sc.next();
        
        for(int i=0; i<words.length(); i++){
            
            System.out.print(words.charAt(i));
            
            if(i % 10 == 9){
                System.out.println();
            }
        }
    }
}