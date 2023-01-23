import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt(); // 시
        int min = sc.nextInt();  // 분
        int time = sc.nextInt(); // 걸리는 시간
        
        min += time; // 현재 분 + 시간
        
        if(min < 60){ // (현재 분 + 시간)이 60 미만이면
            System.out.println(hour + " " + min); // 더해서 그대로 출력
        } else {
            hour += min/60; // 60분 초과 시 몫을 시간에 더해줌
            min %= 60; // 나머지를 분으로 출력
            
            if(hour >= 24){ // 24시를 넘어서면
                hour -= 24; // 0N시로 바꿔줌
            }
            
            System.out.println(hour + " " + min); // 출력
        }
    }
}