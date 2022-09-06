from itertools import permutations
N, M = map(int, input().split())

nums = list(permutations(range(1, N+1), M))
nums.sort()

for i in nums:
    for j in i:
        print(j, end = ' ')
    print()