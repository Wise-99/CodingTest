import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 주어진 정수

        int[] dp = new int[N+1]; // 1부터 N까지의 연산 횟수 저장

        dp[1] = 0; // 초깃값 설정

        for(int i=2; i<= N; i++) {
            dp[i] = dp[i-1] + 1;
            if(i % 2 == 0){
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            }
            if(i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
            }
        }

        System.out.print(dp[N]);
    }
}