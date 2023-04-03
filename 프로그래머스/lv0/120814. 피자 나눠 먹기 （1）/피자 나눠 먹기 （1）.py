import math

def solution(n):
    answer = 0
    
    if n > 7 :
        answer = math.trunc(n / 7)
    
        if n % 7 != 0 :
            answer += 1
        
        return answer
        
    else :
        return 1