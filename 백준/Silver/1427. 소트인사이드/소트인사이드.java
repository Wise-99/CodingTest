import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String num = sc.nextLine();
        
        char[] number = num.toCharArray(); // 자릿수별로 배열에 저장
        
        Arrays.sort(number); // 오름차순 정렬
        
        for(int i=number.length-1; i>=0; i--){ // 오름차순 반대로 출력(내림차순)
            System.out.print(number[i]);
        }
    }
}