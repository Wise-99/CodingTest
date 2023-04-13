def solution(n):
    answer = 0
    num = 1
    while True :
        answer +=1
        num *= answer
        
        if num == n :
            return answer
        elif num > n :
            return answer-1
    
    return answer