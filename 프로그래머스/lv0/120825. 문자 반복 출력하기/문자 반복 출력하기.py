def solution(my_string, n):
    answer = ''
    sen = list(my_string)
    
    for s in sen :
        answer += s * n
    
    return answer