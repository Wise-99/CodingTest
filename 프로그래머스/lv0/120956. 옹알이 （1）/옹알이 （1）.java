class Solution {
    public int solution(String[] babbling) {
        int count = 0; // 말할 수 있는 단어의 갯수
        
        for(String bab : babbling){
            boolean toggle = true;
            
            while(toggle){
                if(bab.contains("aya"))
                    bab = bab.replace("aya", "1");
                   
                else if(bab.contains("ye"))
                   bab = bab.replace("ye", "1");
                   
                else if(bab.contains("woo"))
                   bab = bab.replace("woo", "1");
                   
                else if(bab.contains("ma"))
                   bab = bab.replace("ma", "1");
                
                else // 아무것도 없으면 false로 만들어 while 종료
                    toggle = false;
            }
            bab = bab.replace("1", ""); //  1을 ""로 치환
            
            if(bab == "") count++; // 아무것도 없으면 발음할 수 있는 단어
        }
        
        return count;
    }
}