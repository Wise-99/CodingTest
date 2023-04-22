def solution(array):
    answer = ""
    
    for i in array : # array의 요소를 string으로 변환하여 answer에 추가
        answer += str(i)
    
    return answer.count("7") # "7"의 갯수를 반환