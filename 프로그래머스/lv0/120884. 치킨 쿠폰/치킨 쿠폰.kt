class Solution {
    fun solution(chicken: Int): Int {
        var answer: Int = 0
        var coupon = chicken // 첫 쿠폰 갯수 == 치킨의 수
        
        while(coupon >= 10){ // 쿠폰이 10 이상일 때만 반복
            answer += coupon / 10 // 서비스 치킨 수 = 쿠폰 / 10
            coupon = coupon / 10 + coupon % 10 // 쿠폰 수 = 서비스 치킨 수 + 10 미만의 쿠폰 수
        }
        
        return answer
    }
}