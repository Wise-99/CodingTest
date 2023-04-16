def solution(my_string):
    
    # 순서 보장 및 중복 제거
    return ''.join(dict.fromkeys(my_string))