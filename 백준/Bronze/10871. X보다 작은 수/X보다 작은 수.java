import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();    // 숫자 갯수
        int les = sc.nextInt();    // X
        int[] number = new int[num];
        
        for(int i=0; i<num; i++){
            number[i] = sc.nextInt();
        }
        
        for(int i =0; i < number.length; i++){
            if(les > number[i]){
                System.out.print(number[i]+" ");
            }
        }
    }
}