def solution(d, budget):
    answer = 0
    d.sort()
    
    while len(d) > answer :
        budget -= d[answer]
        
        if budget >= 0 :
            answer += 1
            
        else :
            break
    
    return answer