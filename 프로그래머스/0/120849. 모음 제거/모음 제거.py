def solution(my_string):
    mo = ['a', 'e', 'i', 'o', 'u']
    answer = ''
    lst = list(my_string)
    
    for item in lst:
        if item not in mo:
            answer += item
        
    return answer