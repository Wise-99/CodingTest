import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        BigInteger n1 = new BigInteger(input.next());
        BigInteger n2 = new BigInteger(input.next());
        
        System.out.println(n1.add(n2));
    }
}