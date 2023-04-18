def solution(numbers):
    engNumber = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    
    for index, num in enumerate(engNumber) :
        numbers = numbers.replace(num, str(index))
    
    return int(numbers)