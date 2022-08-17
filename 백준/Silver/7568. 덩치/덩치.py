N = int(input())

data = []
result = []

for _ in range(N):
    x, y = map(int, input().split())
    data.append((x, y))

for i in range(N):
    count = 0
    for j in range(N):
        if data[i][0] < data[j][0] and data[i][1] < data[j][1]:
            count += 1
    result.append(count + 1)

for r in result:
    print(r, end=" ")


