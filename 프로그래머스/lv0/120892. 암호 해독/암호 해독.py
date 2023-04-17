def solution(cipher, code):
    answer = ''
    strlist = list(cipher)
    n = 1
    
    while code*n <= len(strlist) :
        answer += strlist[code * n -1]
        n += 1
    
    return answer