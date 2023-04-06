def solution(my_string):
    
    sen = list(my_string) # 문자열 리스트화
    sen.reverse()         # 리스트 뒤집기
    
    return ''.join(sen)   # 리스트 문자열화