import java.util.Stack;

class Solution {
    public int solution(String s) {
        char[] carr = s.toCharArray(); // s를 char형 배열로 전환
        Stack<Character> stack = new Stack<>(); // character형 스택 생성
        
        for(int i=0; i<carr.length; i++){ //  s의 길이만큼 반복
            char c = carr[i]; // i번째 문자
            if(stack.isEmpty()) // 스택이 비어있다면 c 추가
                stack.push(c);
            else {
                if (stack.peek() == c) { // 스택이 비어있지 않고 top의 문자가 c와 같다면 pop
                    stack.pop();
                } else // 같지 않다면 push
                    stack.push(c);
                
            }
        }
        
        return stack.isEmpty() ? 1 : 0; // 스택이 비어있으면 1, 아니면 0
    }
}