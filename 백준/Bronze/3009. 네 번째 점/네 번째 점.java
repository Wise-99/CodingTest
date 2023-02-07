import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[][] num = new int[3][2]; // 좌표를 입력받을 배열
        int x = 0; // 좌표를 찾아 넣을 변수들
        int y = 0;
        
        // 입력
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[0].length; j++){
                num[i][j] = sc.nextInt();
            }
        }
        
        // x좌표 비교(두 좌표를 비교하여 같으면 남은 하나의 좌표와 x가 동일해야 함)
        if(num[0][0] == num[1][0])
            x = num[2][0];
        else if(num[1][0] == num[2][0])
            x = num[0][0];
        else
            x = num[1][0];
        
        // y좌표 비교
        if(num[0][1] == num[1][1])
            y = num[2][1];
        else if(num[1][1] == num[2][1])
            y = num[0][1];
        else
            y = num[1][1];
        
        System.out.println(x + " " + y); // 출력
    }
}