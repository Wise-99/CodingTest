def solution(array, n):
    answer = 0
    array.sort()

    com = n+100
    
    for i in array:
        if abs(i-n) < com : 
            com = abs(i-n)
            answer = i
            
    return answer