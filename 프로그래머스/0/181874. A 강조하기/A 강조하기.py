def solution(myString):
    answer = ''
    lst = list(myString)
    
    for i in range(len(lst)):
        if lst[i] == 'a' or lst[i] == 'A':
            lst[i] = 'A'
        else:
            lst[i] = lst[i].lower()
            
    answer = ''.join(lst)
    return answer