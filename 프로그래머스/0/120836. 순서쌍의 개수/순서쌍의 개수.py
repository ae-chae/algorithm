def solution(n):
    answer = 0
    sqrt = n ** (1/2)
    
    if sqrt % 1 == 0:
        for i in range(1, int(sqrt)):
            if n % i == 0:
                answer += 1
        answer *= 2
        answer += 1
    else:
        for i in range(1, int(sqrt)+1):
            if n % i == 0:
                answer += 1
        answer *= 2
    
    return answer