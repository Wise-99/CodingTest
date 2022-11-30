import java.util.*;

public class Main{
    public static void main(String[] args){
        int num, count, search;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        int numbers[] = new int[num];
        for(int i=0; i < num; i++){
            numbers[i] = sc.nextInt();
        }
        
        search = sc.nextInt();
        
        count = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == search){
                count++;
            }
        }
        System.out.println(count);
    }
}