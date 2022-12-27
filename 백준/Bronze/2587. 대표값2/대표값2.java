import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5]; // 다섯개의 수를 입력받을 배열
        
        int avg = 0; // 평균을 구할 변수
        
        for(int i=0; i < number.length; i++){
            number[i] = sc.nextInt();
            avg += number[i];
        }
        avg /= 5; // 입력받은 수의 평균
        Arrays.sort(number); // 배열 정렬
        
        System.out.println(avg);
        System.out.println(number[2]);
    }
}