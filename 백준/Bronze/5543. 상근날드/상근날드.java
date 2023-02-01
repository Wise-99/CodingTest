import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int buger = 2001; // 모든 가격은 2000원 이하이므로 최댓값으로 설정
        int drink = 2001;
        int price = 0; // 가격을 받을 변수
        
        for(int i=0; i<3; i++){
            price = sc.nextInt();
            if(price < buger){ // 작은 값을 찾으면 buger에 저장
                buger = price;
            }
        }
        
        for(int i=0; i<2; i++){
            price = sc.nextInt();
            if(price < drink){ // 작은 값을 찾으면 drink에 저장
                drink = price;
            }
        }
        
        System.out.println((buger+drink)-50);
    }
}