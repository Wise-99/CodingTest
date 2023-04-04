def solution(money):
    answer = []
    glass = 0 # 최대로 마실 수 있는 잔 수
    
    while money >= 5500 :
        money -= 5500
        glass += 1
    
    answer.append(glass) # 잔 수 저장
    answer.append(money) # 남는 돈 저장
    
    return answer