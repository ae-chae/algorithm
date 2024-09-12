def solution(n):
    answer = 0
    a = str(n)
    
    lst = list(a)
    
    for item in lst:
        answer += int(item)
    
    return answer