import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();
        
        ArrayList<Integer> number = new ArrayList<>(); // 내림차순 정렬을 위해 Integer로 선언
        
        for(int i=0; i<num; i++){
            number.add(sc.nextInt());
        }
        
        Collections.sort(number); // 내림차순 정렬
        
        for(int value : number) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
    }
}