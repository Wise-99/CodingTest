import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt(); // 초기값
        int count = 0; // 횟수를 셀 변수
        int copy = num; // 비교하기 위해 초기값을 복사
        
        while(true){
            num = ((num%10)*10) + (((num%10) + (num/10))%10); // (수의 일의 자리*10) + (각 자리 수를 더한 후 일의 자리)
            count++; // 횟수 증가
            
            if(num == copy){ // 계산한 수와 초기값이 같으면 종료
                break;
            }
        }
        System.out.println(count); // 횟수 출력
    }
}