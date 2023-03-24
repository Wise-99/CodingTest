import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] s_numbers = new String[numbers.length];
        
        //int형 배열을 String형 배열로 바꿈
        for(int i = 0; i < numbers.length; i++) {
            s_numbers[i] = Integer.toString(numbers[i]);
        }
        
        //두 수를 번갈아가며 합친 수 중 큰 값을 앞으로 정렬(내림차순 정렬)
        Arrays.sort(s_numbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        
        // 모두 0인 경우 0 리턴
        if(s_numbers[0].equals("0")) return "0";

        //문자열을 delimiter("") 기준으로 합침
        return String.join("", s_numbers);

    }
}