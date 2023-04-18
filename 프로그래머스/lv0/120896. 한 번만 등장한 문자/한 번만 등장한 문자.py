def solution(s):
    answer = ''
    
    for i in s:
        if s.count(i)==1: # count()를 이용하여 1개일 경우 answer에 추가
            answer += i
    return ''.join(sorted(answer)) # sorted()로 정렬된 리스트를 join