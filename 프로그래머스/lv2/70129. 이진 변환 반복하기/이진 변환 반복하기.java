class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        
        while(!s.equals("1")) { // s가 "1"이 아닐 때 반복
            
            int befLen = s.length(); // 이진 변환 전 s 길이
            s = s.replace("0",""); // "0"을 ""로 변환
            
            answer[0]++; // 횟수 카운트
            answer[1] += (befLen-s.length()); // 0의 갯수 카운트(이전 길이 - 현재 길이)
            
            s = Integer.toBinaryString(s.length()); // s의 길이를 이진 변환
        }
        
        return answer;
    }
}