def solution(age):
    answer = ''
    ageList = list(str(age))
    
    # 0이 48, a가 97 / 97 - 48 = 49
    for i in ageList :
        # ord() = 문자를 아스키코드로 / chr() = 숫자를 문자로
        answer += chr(ord(i) + 49) 
    
    
    return answer