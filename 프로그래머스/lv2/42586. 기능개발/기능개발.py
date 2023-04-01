def solution(progresses, speeds):
    answer = []
    time = 1 # 작업하는 날짜 수
    cnt = 0 # 작업이 종료되는 갯수
    
    while len(progresses) > 0 : # 작업의 갯수가 0일 때 종료
        
        # 작업 진도 + 속도 * 날짜 수 >= 100
        if progresses[0] + speeds[0]*time >= 100 :
            progresses.pop(0) # 작업이 완료된 것이므로 제거
            speeds.pop(0)
            cnt += 1 # 작업 종료 갯수 += 1
        
        # 100이 안넘을 경우
        else :
            if cnt >= 1 : # 종료된 갯수가 1개 이상이면
                answer.append(cnt) # 답 추가
                cnt = 0 # 종료 갯수 초기화
            
            time += 1 # 날짜 += 1
    
    answer.append(cnt) # 작업의 갯수가 0이 되었을 때 마지막 완료 갯수 추가
    
    return answer