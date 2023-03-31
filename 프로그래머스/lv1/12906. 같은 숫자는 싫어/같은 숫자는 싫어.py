def solution(arr):
    answer = []
    
    answer.append(arr[0]) # 맨 처음 정수를 넣고 시작
    
    for i in arr : # arr 원소 비교
        if(i != answer[-1]): # i와 answer의 top이 같지 않으면 추가
            answer.append(i)
    
    return answer