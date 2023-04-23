def solution(numbers):
    numbers.sort(reverse = True)
    
    # 앞 뒤로 두 개씩 곱하여 max값 비교
    return max(numbers[0] * numbers[1],numbers[-1] * numbers[-2])