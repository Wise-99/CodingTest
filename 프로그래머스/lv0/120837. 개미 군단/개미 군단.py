def solution(hp):
    answer = 0
    
    answer += int(hp / 5)
    hp %= 5
    
    if 3 <= hp :
        answer += int(hp / 3)
        hp %= 3
    
    return answer + hp