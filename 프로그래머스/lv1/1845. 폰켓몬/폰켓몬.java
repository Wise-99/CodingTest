import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {

        int pick = nums.length / 2; // 선택할 수 있는 포켓몬의 갯수
        
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){ // 해시셋에 모든 포켓몬 추가(중복은 들어가지 않음)
            set.add(n);
        }
        
        // (선택할 수 있는 폰켓몬의 수 >= 폰켓몬 종류의 수) 라면
        // 답은 폰캣몬 종류의 수
        if(pick >= set.size()) 
            return set.size();
        else // 아니라면 선택할 수 있는 폰켓몬의 수
            return pick;
    }
}