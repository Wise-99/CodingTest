def solution(array):
    answer = []
    
    answer.append(max(array)) # 가장 큰 값
    answer.append(array.index(max(array))) # 가장 큰 값의 인덱스
    
    return answer