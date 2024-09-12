def solution(rny_string):
    answer = ''
    lst = list(rny_string)
    for i in range(len(lst)):
        if lst[i] == 'm':
            lst[i] = 'rn'
    
    answer = ''.join(lst)
    return answer