def solution(n):
    answer = 0
    
    # 순서쌍의 갯수 = 약수의 갯수
    for i in range(1, n+1) : 
        if n % i == 0 :
            answer += 1
    
    return answer