def solution(s):
    answer = 0
    
    string_list = s.split(' ') # 공백 기준으로 잘라 리스트화
    
    for num in range(len(string_list)) :
        if string_list[num] == 'Z' : # 'Z'면 이전 숫자 빼기
            answer -= int(string_list[num-1])
            continue
        else : # 아니라면 answer에 더하기
            answer += int(string_list[num])
            
    return answer