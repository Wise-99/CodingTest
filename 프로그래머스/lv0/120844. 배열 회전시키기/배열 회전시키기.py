def solution(numbers, direction):
    answer = []
    temp = 0
    
    if direction == "right" :
        temp = numbers[-1] # 마지막 원소 저장
        numbers.remove(temp)
        numbers.insert(0, temp)
    else :
        temp = numbers[0] # 첫번째 원소 저장
        numbers.remove(temp)
        numbers.append(temp)
    
    return numbers