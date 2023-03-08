class Solution {
    public int solution(int n) {
        int answer = n; // answer에 n값을 넣어 비교
        
        int n_cnt = ToBinary(n); // 주어진 수 n을 이진수로 변환했을 때 1의 갯수
        int big_cnt = 0; // 다음 큰 숫자를 찾기 위해 1의 갯수를 받을 변수
        
        while(true){ // 다음 큰 숫자를 찾을 때까지 반복
            big_cnt = ToBinary(++answer); // 먼저 answer를 ++ 한 다음 이진수 변환
            
            if(n_cnt == big_cnt) // 1의 갯수가 같으면 while 종료
                break;
        }
        
        return answer;
        
    }
    
    // 이진수 변환 및 1의 갯수 반환 메소드
    public static int ToBinary(int num){
        String bin = Integer.toBinaryString(num); // 이진수 변환
        int count = 0;
        
        for(int i=0; i<bin.length(); i++){ // 1의 갯수 세기
            if(bin.charAt(i) == '1')
                count++;
        }
        
        return count; // 1의 갯수 반환
    }
}