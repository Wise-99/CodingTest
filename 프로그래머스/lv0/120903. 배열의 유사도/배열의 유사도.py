def solution(s1, s2):
    answer = s1 + s2 # 리스트 합침
    set_answer = set(answer) # 중복 제거
    
    return len(answer) - len(set_answer) # 전체 원소 갯수 - 중복이 없는 리스트 원소 갯수