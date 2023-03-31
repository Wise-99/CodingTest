def solution(s):
    stack = []
    
    for i in s:
        if i == "(": # i가 "(" 이면 스택에 추가
            stack.append(i)
        else :
            if not stack : # 스택이 비어있으면 false 반환
                return False
            else : # 비어있지 않다면 추가한 괄호 제거
                stack.pop()
            
    return stack == [] # 스택이 비어있으면 true 반환
   

