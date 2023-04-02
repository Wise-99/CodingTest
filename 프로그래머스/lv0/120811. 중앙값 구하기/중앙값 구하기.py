import math

def solution(array):
    
    array.sort()
    
    return array[math.trunc(len(array) / 2)]