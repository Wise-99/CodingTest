def solution(n):
    answer = 0
    cnt = 1 # 1~n 사이의 수
    
    while cnt != n : # cnt와 n이 같으면 종료
        cnt += 1
        
        for num in range(2, cnt + 1) : 
            if cnt % num == 0 and num != cnt: # num이 cnt의 약수라면
                answer += 1 # 정답 갯수 추가
                break

    return answer