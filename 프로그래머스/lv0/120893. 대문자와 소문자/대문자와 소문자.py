def solution(my_string):
    answer = ''
    strlist = list(my_string)
    
    for n in strlist :
        if n.isupper() :
            answer += n.lower()
        else :
            answer += n.upper()
    
    return answer