def solution(dots):
    x2, y2 = max(dots) # 원소 값 합의 최대 리스트
    x1, y1 = min(dots) # 원소 값 합의 최소 리스트

    return (x2-x1)*(y2-y1)