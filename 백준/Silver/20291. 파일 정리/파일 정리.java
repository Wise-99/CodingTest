import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Map<String, Integer> map = new TreeMap<>();// Map 생성
        
        int num = sc.nextInt();
        
        for(int i=0; i<num; i++){
            String input = sc.next();
            String key = input.substring(input.indexOf(".")+1); // 확장자 이름만 저장
            
            if(map.containsKey(key)){ // 같은 확장자(키)가 존재한다면 해당 키의 값 증가
                int val = map.get(key);
                map.replace(key, ++val);
            } else { // 아니라면 확장자, 1 저장
                map.put(key, 1);
            }
        }
        
        for(String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
    }
}