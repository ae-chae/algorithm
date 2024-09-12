def solution(my_string, alp):
    answer = ''
    lst = list(my_string)
    
    for i in range(len(lst)):
        if lst[i] == alp:
            lst[i] = alp.upper()
    
    answer = ''.join(lst)
    
    return answer