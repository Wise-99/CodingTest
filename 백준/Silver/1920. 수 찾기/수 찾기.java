import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a); // 오름차순 정렬

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int answer = 0;
            int start = 0, end = n - 1;
            int x = sc.nextInt();
            while (start <= end) { // 이분 탐색
                int mid = (start + end) / 2;
                if (a[mid] == x) { // 같은 값이 존재하면 1 출력
                    answer = 1;
                    break;
                }
                if (a[mid] > x) // x보다 크거나 같은 값이 중간 값이라면 절반으로 줄여서 탐색
                    end = mid - 1;
                else 
                    start = mid + 1;
            }
            System.out.println(answer); // 출력
        }
    }
}