def solution(my_string):
    my_string = my_string.lower() # 소문자 변경
    answer = sorted(my_string)    # 정렬(리스트화)
    
    return ''.join(answer)        # 리스트 연결