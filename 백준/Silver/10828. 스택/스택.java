import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int num = sc.nextInt(); // 명령의 수를 담을 변수
        Stack<Integer> stack = new Stack<Integer>();
        String words = ""; // 명령어를 담을 변수
        int su = 0; // push 정수를 담을 변수
        
        for(int i=0; i<num; i++){ // num 만큼 반복
            words = sc.next(); // 명령어 입력
            
            if(words.equals("push")){ // push
                su = sc.nextInt();
                stack.push(su);
            } 
            
            if(words.equals("pop")){ // pop
                if(stack.isEmpty()) // 비어있으면 -1 저장
                    sb.append(-1 + "\n");
                else{
                    sb.append(stack.pop() + "\n"); // 가장 상단의 값 저장
                }
                
            } 
            
            if(words.equals("size")){
                sb.append(stack.size()).append("\n");
            } 
            
            if(words.equals("empty")){
                if(stack.isEmpty())
                    sb.append(1 + "\n");
                else
                    sb.append(0 + "\n");
            }  
            
            if(words.equals("top")){
                if(stack.isEmpty())
                    sb.append(-1 + "\n");
                else
                    sb.append(stack.peek() + "\n"); // 가장 상단의 값 저장
            }
        }
        System.out.println(sb); // 출력
    }
}