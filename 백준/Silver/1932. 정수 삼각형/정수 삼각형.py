import sys
input = sys.stdin.readline

n = int(input())
maps = [list(map(int, input().split())) for _ in range(n)]

for i in range(1, n):
    for j in range(i+1):
        if j == 0:
            left = 0
        else:
            left = maps[i-1][j-1]

        if i == j:
            right = 0
        else:
            right = maps[i-1][j]
        maps[i][j] = maps[i][j] + max(right, left)

print(max(maps[-1]))