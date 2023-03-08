class Solution {
    public int solution(int n) {
        int answer = n;
        
        int n_cnt = ToBinary(n); // 주어진 수 n을 이진수로 변환했을 때 1의 갯수
        int big_cnt = 0; // 다음 큰 숫자를 찾기 위해 1의 갯수를 받을 변수
        while(true){
            n++;
            big_cnt = ToBinary(++answer);
            
            if(n_cnt == big_cnt)
                break;
        }
        
        return answer;
        
    }
    
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