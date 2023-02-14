import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0; // 중복 갯수를 셀 변수

        for (int i = 0; i < N; i++) { // 입력
            map.put(br.readLine(), 1); // 키 = 단어, 값 = 1
        }
        
        for (int i = 0; i < M; i++) { // 비교
            String words = br.readLine();
            if (map.get(words) != null) { // 입력한 키 중에 null이 아닌 값이 있다면 카운트
                count++;
            }
        }
        bw.write(count + "\n"); // 출력

        br.close();
        bw.flush();
        bw.close();
    }
}