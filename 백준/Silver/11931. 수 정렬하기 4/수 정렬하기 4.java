import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int num = Integer.parseInt(st.nextToken());
        int[] number = new int[num];
        
        for(int i=0; i<num; i++){
            number[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(number); // 오름차순 정렬
        
        for(int i=number.length-1; i>=0; i--){
            writer.write(number[i]+"\n"); 
        }
        writer.flush();
    }
}