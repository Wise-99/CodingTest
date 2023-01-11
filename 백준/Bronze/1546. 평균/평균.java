import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        double[] score = new double[num]; // 실제 점수를 저장할 배열
        double answer = 0.0;
        double max = 0.0; // 최댓값을 저장할 배열
        
        for(int i=0; i<score.length; i++){
            score[i] = sc.nextDouble();
            if(max < score[i]){ // 최댓값 구하기
                max = score[i];
            }
        }
        
        for(int i=0; i<score.length; i++){ // 점수 수정
            answer += score[i] / max *100.0;
        }
        
        answer /= num;
        
        System.out.println(answer);
    }
}