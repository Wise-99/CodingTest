import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = 0; // 값을 입력받을 변수
        int min = 100; // 홀수 중 최솟값을 찾아 넣을 변수
        int sum = 0; // 홀수의 합을 저장하기 위한 변수
        
        for(int i=0; i<7; i++){
            num = sc.nextInt();
            if(num%2 == 1){ // num이 홀수라면 합산
                sum += num;
                
                if(min > num){ // 홀수이면서 min보다 작은 값이면 최솟값으로 설정
                    min = num;
                }
            }
        }
        
        if(sum == 0){ // 홀수의 합계가 0이면(홀수가 없으면) -1 출력
            System.out.println(-1);
        } else { // 아니라면 합계와 최솟값 출력
            System.out.println(sum);
            System.out.println(min);
        }
    }
}