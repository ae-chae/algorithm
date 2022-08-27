import sys

input=sys.stdin.readline

N = int(input())

a = []
a = list(map(int, input().split()))

# result = []
# for value in a:
#     if value not in result:
#         result.append(value)

# result.sort()

# #print(*result)

# for i in range(N):
#     a[i] = result.index(a[i])

# print(*a) 시간 초과 ... .. . ..  . . 

aset = sorted(set(a))

adict = {}
for i in range(len(aset)):
    adict[aset[i]] = i

for i in a:
    print(adict[i], end=' ')