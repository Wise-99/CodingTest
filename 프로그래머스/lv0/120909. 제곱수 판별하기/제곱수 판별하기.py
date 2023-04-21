def solution(n):
    sqrt = n**(1/2) # 제곱근 구하는 공식(n제곱 * 1/2)
    
    return 1 if sqrt % 1 == 0 else 2 # 제곱근이 정수면 1 아니면 2 반환
        