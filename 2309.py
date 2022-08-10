from itertools import combinations

h = [int(input()) for _ in range(9)]
lst =list(combinations(h, 7))

for i in lst:
    if sum(i) == 100:
        a = list(i)
        break

a.sort()
for i in a:
    print(i)
