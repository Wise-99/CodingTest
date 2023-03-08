import java.util.Stack;

class Solution {
    boolean solution(String s) {

        Stack<Integer> stack = new Stack<>();

        // s의 길이만큼 반복
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // 한 글자씩 비교
            
            if (c == '(') {
                stack.push(1); // ( 이면 1을 추가
            }
            if (c == ')') {
                if (stack.isEmpty()) { // ) 인데 비어있으면 바로 false 반환
                    return false;
                }
                stack.pop(); // 비어있지 않다면 추가된 1을 제거
            }
        }

        return stack.isEmpty(); // 스택이 비어있는지 확인
    }
}