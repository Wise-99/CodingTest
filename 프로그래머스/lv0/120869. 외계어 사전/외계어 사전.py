def solution(spell, dic):
    
    for d in dic :          # 단어 하나씩 비교
        count = 0           # 스펠이 들어가는 횟수 카운트
        for s in spell :    # 스펠 하나씩 비교
            if s in d :     # 단어에 스펠이 들어간다면 count ++
                count += 1
                continue
                
        if count == len(spell) : # count와 spell 갯수가 같다면 1 리턴
            return 1
        
    return 2