import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        // Scanner는 시간초과...
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" "); // 한 줄(배열의 크기)을 배열로 입력받음
        int num1 = Integer.parseInt(num[0]); // 첫번째 배열의 크기
        int num2 = Integer.parseInt(num[1]); // 두번째 배열의 크기

        int[] answer = new int[num1 + num2]; // 합친 후에 출력할 배열

        String[] arrA = br.readLine().split(" "); // 첫번째 배열

        for (int i = 0; i < num1; i++) {
            answer[i] = Integer.parseInt(arrA[i]); // 첫번째 배열 집어 넣기
        }

        String[] arrB = br.readLine().split(" "); // 두번째 배열
        
        for (int i = 0; i < num2; i++) {
            answer[i + num1] = Integer.parseInt(arrB[i]); // 두번째 배열 집어넣기(첫번째 배열이 끝난 지점부터)
        }

        Arrays.sort(answer);// 오름차순 정렬

        // bufferedWriter 사용하기
        for (int a : answer) {
            bw.write(String.valueOf(a) + " ");
        }

        bw.flush();
        bw.close();
    }
}