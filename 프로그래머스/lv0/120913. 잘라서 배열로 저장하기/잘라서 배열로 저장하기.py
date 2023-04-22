def solution(my_str, n):
    answer = []

    for i in range(0, len(my_str), n) : # 0 ~ my_str의 길이까지 만큼 반복
        answer.append(my_str[:n])       # n-1까지 answer에 저장
        my_str = my_str[n:]             # my_str을 n부터 잘라냄
    
    return answer