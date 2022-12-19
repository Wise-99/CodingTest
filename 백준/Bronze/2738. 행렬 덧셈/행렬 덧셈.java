import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = 0; // 행렬의 크기
        int M = 0; // 행렬의 크기
        
        N = sc.nextInt();
        M = sc.nextInt();
        int[][] nums = new int[N][M];
        int[][] answer = new int[N][M];
        
        // 한 배열을 입력 받음
        for(int i=0; i < N; i++){
            for(int j=0; j < M; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        
        int number = 0;
        
        // 두번째 배열을 입력받아 계산
        for(int i=0; i < N; i++){
            for(int j=0; j < M; j++){
                number = sc.nextInt();
                answer[i][j] = nums[i][j] + number;
            }
        }
        
        // 계산 결과 출력
        for(int i=0; i < N; i++){
            for(int j=0; j < M; j++){
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}