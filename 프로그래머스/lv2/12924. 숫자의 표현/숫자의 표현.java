class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){ // 1 ~ n까지 반복
            int sum = 0;
            
            for(int j=i; j<=n; j++){ // 연속된 숫자로 표현 수 카운트
                sum += j;
            
                if(sum == n){ // 연속된 숫자의 합이 n이면 answer++, 다시 시작
                    answer++;
                    break;
                }
                else if(sum > n) // sum이 n 보다 커지면 종료
                    break;
            }
        }
        
        return answer;
    }
}