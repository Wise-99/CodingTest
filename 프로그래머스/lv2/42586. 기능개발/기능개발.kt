import java.util.*

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        var cnt = 0 // 한번에 배포되는 기능의 수
        var time = 1 // 작업이 완료되는 날짜
        
        var progressesQueue : Queue<Int> = LinkedList<Int>()
        var speedsQueue : Queue<Int> = LinkedList<Int>()
        
        // progresses, speeds를 Queue로 변환
        for(i in 0 until progresses.size){
            progressesQueue.add(progresses[i])
            speedsQueue.add(speeds[i])
        }
        
        // queue가 비어있지 않은 동안 반복
        while(!progressesQueue.isEmpty()){
            
            // 작업 진도 + (작업 속도 * 날짜) >= 100
            if(progressesQueue.element() + speedsQueue.element()*time >= 100){
                
                // 작업 제거 및 배포 기능 수 ++
                progressesQueue.remove()
                speedsQueue.remove()
                cnt++
            }
            
            // 100이 아니라면
            else {
                if(cnt >= 1){ // 완료된 작업 수가 1 이상이면
                    answer = answer.plus(cnt) // answer에 추가하고 작업 수 초기화
                    cnt = 0
                }
                
                time ++ // 날짜++
            }
        }
        answer = answer.plus(cnt) // 마지막 완료되는 작업 수 추가
        
        return answer
    }
}