def solution(my_string, num1, num2):
    temp = ''
    str_list = list(my_string)
    
    temp = str_list[num1]
    str_list[num1] = str_list[num2]
    str_list[num2] = temp
    
    return ''.join(s for s in str_list)