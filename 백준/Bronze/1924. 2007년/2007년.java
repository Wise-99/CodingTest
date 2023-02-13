import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int date = sc.nextInt();
        
        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 월 별 날짜 수 저장
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"}; // 요일 저장
        
        int total = date; // 총 날짜를 저장할 변수
        for(int i=0; i<month-1; i++){ // 총 날짜를 더해줌
            total += day[i];
        }
        
        System.out.println(week[total%7]);
    }
}
