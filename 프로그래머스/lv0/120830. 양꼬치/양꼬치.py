import math
def solution(n, k):
    # 양꼬치 가격 - ((음료수 갯수 - 서비스로 나간 음료수의 갯수) * 음료수 가격)
    return (n * 12000) + ((k - math.trunc(n/10)) * 2000)