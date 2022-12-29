import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int total = sc.nextInt(); // 전체 대상자
        int award = sc.nextInt(); // 수상자
        
        Integer[] number = new Integer[total]; // 전체 대상자의 점수를 입력 받을 배열
        
        for(int i=0; i < total; i++){
            number[i] = sc.nextInt(); // 점수 입력
        }
        
        Arrays.sort(number,Collections.reverseOrder()); // 점수 내림차순 정렬
        
        System.out.println(number[award-1]); // 수상자 인원-1한 배열의 값(커트라인)
    }
}