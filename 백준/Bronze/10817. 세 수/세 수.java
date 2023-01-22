import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        
        Arrays.sort(arr); // 오름차순 정렬
        
        System.out.println(arr[1]);
    }
}