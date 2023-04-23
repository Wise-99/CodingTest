def solution(polynomial):
    x, num = 0, 0
    polynomial = polynomial.split(" + ")

    for p in polynomial:
        if p.isnumeric():
            num += int(p)
        else:
            if len(p) == 1:      # 그냥 x일 때 +1
                x += 1
            else:
                x += int(p[:-1]) # x 앞의 숫자만 뽑아 계산
    
    if x == 0:
        if num == 0 :
            return "0"
        return str(num)
    
    if x == 1:
        x = ""
    
    if num == 0:
        return str(x) + "x"
                
    return str(x) + "x + " + str(num)