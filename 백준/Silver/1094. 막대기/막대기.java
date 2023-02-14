import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt(); // 원하는 막대 길이
        int count = 0; // 막대기의 갯수를 셀 변수
        int stick = 64; // 가지고 있는 막대의 길이
        
        while(num > 0){ // 원하는 막대 길이가 0보다 크면 반복
            if(num < stick) // 가지고 있는 막대 길이가 원하는 막대 길이보다 길면
                stick /= 2; // 절반으로 나눔
            else{ // 아니라면 막대기 갯수를 늘리고, 원하는 막대 길이 - 가지고 있는 막대 길이
                count++;
                num -= stick;
            }
        }
        
        System.out.println(count); // 갯수 출력
    }
}