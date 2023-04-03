def solution(n):
    
    pizza = 1 # 피자 판 수
    while (pizza * 6) % n != 0 : # 피자 조각 갯수 % n == 0이면 멈춤
        pizza += 1
    
    return pizza