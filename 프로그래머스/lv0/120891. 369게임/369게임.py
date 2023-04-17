def solution(order):
    answer = 0
    number = list(str(order))

    for n in number :
        if n == '3' or n == '6' or n == '9' :
            answer += 1
    
    return answer