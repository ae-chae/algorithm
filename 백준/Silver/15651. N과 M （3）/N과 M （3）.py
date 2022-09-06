from itertools import product

N, M = map(int, input().split())

def pro():
    nums = list(product(range(1, N+1), repeat = M))
    nums.sort()
    for n in nums:
        print(' '.join(list(map(str,n))))

pro()