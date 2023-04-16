def solution(sides):

    s_max = max(sides)
    
    # 나머지 두 변의 길이 > 가장 긴 변의 길이
    if sum(sides) - s_max > s_max :
        return 1
    else :
        return 2