def solution(rsp):
    answer = ''
    lst = list(rsp)
    
    for item in lst:
        if item == '2':
            answer += '0'
        elif item == '0':
            answer += '5'
        else:
            answer += '2'
    
    return answer