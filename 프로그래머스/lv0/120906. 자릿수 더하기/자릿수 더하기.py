def solution(n):
    answer = 0
    n_list = list(str(n))
    
    for n in n_list :
        answer += int(n)
    
    return answer