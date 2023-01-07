import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int[][] number = new int[num][2];
        
        // 2차원 배열 입력
        for(int i=0; i<num; i++){
            number[i][0] = sc.nextInt();
            number[i][1] = sc.nextInt();
        }
        
        // 2차원 배열 정렬(람다식)
        Arrays.sort(number, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
        
		// 출력
		for(int i = 0; i < num; i++) {
            System.out.println(number[i][0] + " " + number[i][1]);
		}
    }
}