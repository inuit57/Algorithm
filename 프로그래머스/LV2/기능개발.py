def solution(progresses, speeds):
    answer = []
    cnt = 0
    while(progresses != []):
        for i, v in enumerate(progresses):
            progresses[i] += speeds[i]

        while(True):
            if (progresses == []) or (progresses[0] < 100) :
                if cnt > 0 :
                    answer.append(cnt)
                    cnt = 0 
                break;
            else:
                cnt += 1; 
                del progresses[0]
                del speeds[0]
                
    return answer
