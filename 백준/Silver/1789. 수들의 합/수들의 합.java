import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long num = sc.nextLong();
        long sum = 1; // 숫자들의 합
        int count = 1; // 더한 횟수
        
        while(sum < num){
            count++;
            sum += count; // 1부터 차례대로 더해줌
        }
        if(sum > num) count--;
        
        System.out.println(count); // 최대 숫자의 갯수
    }
}