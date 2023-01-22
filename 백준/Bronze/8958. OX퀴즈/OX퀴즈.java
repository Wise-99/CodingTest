import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt(); // 받을 문자열의 갯수
        String[] quiz = new String[num];
        
        for(int i=0; i<num; i++){ // 문자열 입력
            quiz[i] = sc.next();
        }
        
        for(int i=0; i<quiz.length; i++){ // 문자열 갯수만큼 반복
            
            int cnt = 0; // 누적 맞춘 횟수
            int sum = 0; // 점수 합산
            
            for(int j=0; j<quiz[i].length(); j++){ // 문자열 길이만큼 반복
                if(quiz[i].charAt(j) == 'O'){ // 한 문자가 'O'이면
                    cnt++; // 점수 누적
                } else{
                    cnt = 0; // 아니면 0
                }
                
                sum += cnt; // 점수 합산
            }
            System.out.println(sum); // 한 문자열의 점수 출력
        }
    }
}