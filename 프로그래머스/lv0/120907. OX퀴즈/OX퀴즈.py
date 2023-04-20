def solution(quiz):
    answer = []
    
    for q in quiz :
        q = q.replace('=', '==')    # eval()을 했을 때 True False를 나타내기 위함
        
        if eval(q) :                # 맞는 수식이면 O
            answer.append('O')
        else :                      # 틀리면 X
            answer.append('X')
    
    return answer