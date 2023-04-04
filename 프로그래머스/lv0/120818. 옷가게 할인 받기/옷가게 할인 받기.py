import math

def solution(price):
    answer = 0
    sale = 1
    
    if price >= 100000 and price < 300000 :
        sale = 0.95
    
    elif price >= 300000 and price < 500000 :
        sale = 0.9
    
    elif price >= 500000 :
        sale = 0.8
    
    return math.trunc(price * sale)