import sys

input=sys.stdin.readline

N = int(input())

arr = [list(input().split()) for _ in range(N)]

arr.sort(key=lambda x: int(x[0]))

for x, y in arr:
    print(x, y)
