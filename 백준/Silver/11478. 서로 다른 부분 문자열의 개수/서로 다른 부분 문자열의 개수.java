import java.util.Scanner;
import java.util.HashSet;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String words = sc.next();
        HashSet<String> hs = new HashSet<String>(); // HashSet은 자동으로 중복 제거
        
        for(int i=0; i<words.length(); i++){
            String s = "";
            for(int j=i; j<words.length(); j++){
                s += words.substring(j, j+1);
                hs.add(s);
            }
        }
        
        System.out.println(hs.size()); // 갯수 출력
    }
}