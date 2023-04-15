def solution(n):
    answer = []
    num = 2
    
    while n != 1 :
        if n % num == 0 :
            answer.append(num)
            n = n / num
            
        else :
            num += 1
            
    answer = list(set(answer))
    answer.sort()
    
    return answer