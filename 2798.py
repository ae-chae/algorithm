from itertools import combinations

a, b = map(int, input().split())

inp = list(map(int, input().split()))
lst = list(combinations(inp, 3))
total = 0

for i in lst:
    if sum(i) <= b:
        total = max(total, sum(i))
print(total)