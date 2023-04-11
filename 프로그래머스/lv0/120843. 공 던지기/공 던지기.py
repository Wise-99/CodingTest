def solution(numbers, k):
    
    if len(numbers) < k * 2 :
        numbers = numbers * ((k*2) // len(numbers) + 1)

    answer = numbers[2*(k-1)]
    return answer