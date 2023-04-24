def solution(my_string):
    answer = 0
    num = "0"
    
    for s in my_string :
        if s.isnumeric() :
            num += s
        else :
            answer += int(num)
            num = "0"
            
    answer += int(num)
            
    if answer > 0 :
        return answer
    else :
        return 0