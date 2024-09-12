def solution(my_string, num1, num2):
    answer = ''
    lst = list(my_string)
    
    tmp = ''
    
    tmp = lst[num1]
    
    lst[num1] = lst[num2]
    lst[num2] = tmp
    
    answer = ''.join(lst)
    return answer