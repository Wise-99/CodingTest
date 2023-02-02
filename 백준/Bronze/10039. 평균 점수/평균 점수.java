import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int sum = 0; // 합을 저장할 변수
        int score = 0; // 점수를 받을 변수
        
        for(int i=0; i<5; i++){
            score = sc.nextInt();
            
            if(score >= 40){
                sum += score;
            } else {
                sum += 40;
            }
        }
        
        System.out.println(sum/5);
    }
}