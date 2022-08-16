N = int(input())
cnt = 0

for i in range(1, N+1):
    n = list(map(int, str(i)))

    if i < 100:
        cnt += 1
    elif n[0]-n[1] == n[1]-n[2]:
        cnt += 1
print(cnt)