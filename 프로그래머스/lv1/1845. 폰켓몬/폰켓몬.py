def solution(nums):
    answer = 0
    length = len(nums) / 2 # 고를 수 있는 폰켓몬 수
    p_type = set(nums) # 중복 제거한 폰켓몬 종류
    
    for v in p_type : # 폰켓몬 종류만큼 반복
        if(answer < length): # 최대한 데려갈 수 있는 종류 수 < 고를 수 있는 폰켓몬 수
            answer += 1
    
    return answer