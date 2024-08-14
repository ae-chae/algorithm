from collections import deque
n, m, r = map(int,input().split())

graph = [[0] for _ in range(n+1)]

for i in range(1, m+1):
    a, b = map(int,input().split())
    graph[a].append(b)
    if a not in graph[b]:
        graph[b].append(a)

for i in range(n+1):
    graph[i].sort()

flag = [0] * (n + 1)

cnt = 1
def BFS(start):
    global cnt
    q = deque()
    q.append(start)
    flag[start] = cnt
    while q:
        tmp = q.popleft()
        for i in graph[tmp]:
            if flag[i] == 0:
                q.append(i)
                flag[i] = cnt
                cnt += 1
    
BFS(r)

for i in range(1, n+1):
    print(flag[i])