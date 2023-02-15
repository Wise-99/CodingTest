import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 숫자의 갯수
        
        HashSet<Integer> hs = new HashSet<Integer>(); // HashSet은 자동으로 중복 제거
        
        for(int i=0; i<num; i++){
            hs.add(sc.nextInt()); // 숫자의 갯수만큼 추가
        }
        
        // HashSet의 숫자를 옮겨 담아 정렬
        ArrayList<Integer> arr = new ArrayList<Integer>(hs);
        Collections.sort(arr);
        
        // 출력
        for(Integer i : arr){
            System.out.println(i);
        }
    }
}