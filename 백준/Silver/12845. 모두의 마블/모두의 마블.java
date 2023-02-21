import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt(); // 카드의 갯수
        int[] level = new int[num]; // 카드의 레벨을 받을 배열
        
        for(int i=0; i< num; i++){ // 각 카드의 레벨 입력
            level[i] = sc.nextInt();
        }
        
        Arrays.sort(level); // 레벨 오름차순 정렬
        
        int money = level[num-1] + level[num-2]; // 가장 레벨이 높은 카드부터 합산
        
        for(int i=num-3; i>=0; i--){
            money += level[num-1] + level[i];
        }
        
        System.out.println(money);
    }
}