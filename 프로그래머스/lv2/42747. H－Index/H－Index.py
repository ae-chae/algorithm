def solution(citations):
    answer = 0
    citations.sort(reverse=True)

    for i in range(len(citations)):
        if min(citations) < len(citations) and max(citations) > len(citations) :
            if citations[i] <= (i):
                answer = i
                break

                
        elif max(citations) < len(citations):
            answer = min(citations)
            break
            
        else:
            answer = len(citations)

    return answer