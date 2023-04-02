def solution(array):
    answer = 0
    dic = {a : 0 for a in array} # array를 딕셔너리로 전환
    
    for k, v in dic.items() :
        for num in array :
            if k == num :
                dic[k] += 1
    
    # max(최빈) 값이 두 개 이상일 때, 컴프리헨션
    maximum = [k for k,v in dic.items() if max(dic.values()) == v]

    
    if len(maximum) >= 2:
        return -1
    else :
        return maximum[0]