def solution(emergency):
    answer = []
    temp = sorted(emergency, reverse = True) # 내림차순 정렬
    
    for i in emergency : 
        answer.append(temp.index(i)+1) # i의 인덱스 찾아서 + 1
    
    return answer