import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] ch = new char[5][15];
        int max = 0;	// 입력받는 문자열 중 가장 긴 문자열의 길이
        
        // 입력
        for(int i=0; i<ch.length; i++){
            String str = br.readLine();
            max = Math.max(max, str.length());	// 가장 긴 문자열 체크
            
            for(int j=0; j<str.length(); j++){
                ch[i][j] = str.charAt(j);
            }
        }
        
        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if(ch[j][i] == '\0') continue;
                sb.append(ch[j][i]);
            }
        }
        System.out.println(sb);
    }
}