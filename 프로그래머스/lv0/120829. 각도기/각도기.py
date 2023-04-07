def solution(angle):
    answer = 0
    
    if 90 > angle :
        return 1
    
    elif angle == 90 :
        return 2
    
    elif 90 < angle and 180 > angle :
        return 3
    
    else :
        return 4