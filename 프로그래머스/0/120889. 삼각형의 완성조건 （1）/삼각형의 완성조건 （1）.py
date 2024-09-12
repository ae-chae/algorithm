def solution(sides):
    answer = 2
    m = max(sides)
    
    sides.remove(m)
    
    s = sum(sides)
    
    if m < s:
        answer = 1
    
    
    return answer