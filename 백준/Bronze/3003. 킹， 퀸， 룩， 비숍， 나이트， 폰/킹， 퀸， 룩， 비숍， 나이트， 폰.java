import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] chess = {1, 1, 2, 2, 2, 8}; // 원래 체스의 갯수
        int[] num = new int[6]; // 가지고 있는 체스의 수
        
        for(int i=0; i<num.length; i++){ // 입력
            num[i] = sc.nextInt();
        }
        
        for(int i=0; i<num.length; i++){ // 갯수 계산
            System.out.print(chess[i] - num[i]+ " ");
        }
    }
}