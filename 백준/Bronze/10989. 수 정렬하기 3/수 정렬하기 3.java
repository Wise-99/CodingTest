import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        // Scanner 시간초과로 사용X
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        
        int[] number = new int[num];
        
        for(int i=0; i<num; i++){
            number[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(number);
        
        for(int i=0; i<num; i++){
            sb.append(number[i]).append('\n');
        }
        
        System.out.println(sb);
    }
}