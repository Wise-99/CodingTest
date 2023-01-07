import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        String[] words = new String[num];
        
        sc.nextLine(); // 개행 버림(nextInt와 nextLine 메소드의 메커니즘이 달라 생기는 오류)
        
        // 배열에 단어 입력
        for(int i=0; i< num; i++){
            words[i] = sc.nextLine();
        }
        
        // 단어 정렬
        Arrays.sort(words, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// 단어 길이가 같을 경우 
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				// 그 외의 경우 
				else {
					return s1.length() - s2.length();
				}
			}
		});
        
        System.out.println(words[0]);
		
		for (int i = 1; i < num; i++) {
			// 중복되지 않는 단어만 출력
			if (!words[i].equals(words[i - 1])) {
				System.out.println(words[i]);
			}
		}
    }
}