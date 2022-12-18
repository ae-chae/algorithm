from collections import Counter

def solution(k, tangerine):
    answer = 0
    n = 0
    tan = Counter(tangerine).most_common()
    
    for t in tan:
        n += t[1]
        answer += 1
        if n >= k:
            return answer
    
    return answer
