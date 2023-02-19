import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt(); // 슬라임의 갯수
        
        int[] slime = new int[num]; // 슬라임의 크기를 저장할 배열
        for(int i=0; i< num; i++){
            slime[i] = sc.nextInt();
        }
        
        Arrays.sort(slime); // 슬라임의 크기를 오름차순으로 정렬
        
        int score = 0; // 점수를 저장할 변수
        
        // 오름차순이므로 뒤에서 부터 사용히여 점수 및 슬라임 크기 계산
        for(int i=num-2; i>=0; i--){
            score += slime[i] * slime[i+1];
            slime[i] = slime[i] + slime[i+1];
        }
        
        System.out.println(score); // 출력
    }
}