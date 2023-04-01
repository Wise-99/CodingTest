import math

def solution(numer1, denom1, numer2, denom2):
    
    numer = numer1 * denom2 + numer2 * denom1 # 분자
    denom = denom1 * denom2                   # 분모
    
    gcd = math.gcd(numer, denom)              # 분자, 분모의 최대공약수를 구함
    
    return [numer//gcd, denom//gcd]