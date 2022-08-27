import sys
from collections import Counter

input=sys.stdin.readline

n = int(input())
a = []

for i in range(n):
    a.append(int(input()))

a.sort()

c = Counter(a)
order = c.most_common()
maximum = order[0][1]

modes = []
for num in order:
    if num[1] == maximum:
        modes.append(num[0])
modes.sort()

if len(a)<2:
    m = a[0]
else:
    if len(modes) == 1:
        m = modes[0]
    else:
        m = modes[1]


print(round(sum(a)/n))
print(a[n//2])
print(m)
print(a[n-1]-a[0])