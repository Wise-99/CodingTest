import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int total = sc.nextInt(); // 단어의 총 갯수
        
        for(int i=0; i<total; i++){ // 단어의 갯수만큼 반복
            
            int repeat = sc.nextInt(); // 단어를 반복할 횟수
            String words = sc.next(); // 단어
            
            for(int j=0; j<words.length(); j++){ // 단어의 길이만큼 반복
                
                for(int k=0; k<repeat; k++){ // 한 글자를 반복할 횟수인 repeat만큼 반복
                    
                    System.out.print(words.charAt(j)); // 한 글자 반복
                }
            }
            System.out.println(); // 한 단어가 끝나면 줄 바꿈
        }
    }
}