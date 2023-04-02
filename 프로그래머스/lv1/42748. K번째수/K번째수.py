def solution(array, commands):
    answer = []
    
    
    for l in range(len(commands)):
        i = commands[l][0]
        j = commands[l][1]
        k = commands[l][2]
        
        num_list = array[i-1 : j]
        num_list.sort()
        
        answer.append(num_list[k-1])
        
    return answer