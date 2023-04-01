import collections

def solution(participant, completion):
    participant.sort() # 배열 정렬
    completion.sort()
    
    # Counter()는 Dic과 같이 hash형 자료들의 값의 개수를 셀 때 사용
    answer = collections.Counter(participant) - collections.Counter(completion)
    
    # 완주하지 못한 선수는 1명으로 정해져있기 때문에 리스트화 후 0번째 리턴
    return list(answer)[0]