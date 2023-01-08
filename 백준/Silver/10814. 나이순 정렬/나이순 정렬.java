import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        String[][] ageName = new String[num][2];
        
        // 2차원 배열에 나이와 이름 입력
        for(int i=0; i<num; i++){
            for(int j=0; j<2; j++){
                ageName[i][j] = sc.next();
            }
        }
        
        Arrays.sort(ageName, new Comparator<String[]>() { // 0:나이 , 1:이름
			@Override
			public int compare(String[] o1,String[] o2) {			
					return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
        
        for(int i=0; i<num; i++) {
				System.out.println(ageName[i][0]+" "+ageName[i][1]);
		}
    }
}