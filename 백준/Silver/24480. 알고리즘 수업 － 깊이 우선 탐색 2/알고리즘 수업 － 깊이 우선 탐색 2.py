import sys
sys.setrecursionlimit(10**5)
n, m, r = map(int,input().split())

graph = [[0] for _ in range(n+1)]

for i in range(1, m+1):
    a, b = map(int,input().split())
    graph[a].append(b)
    if a not in graph[b]:
        graph[b].append(a)

#print(graph)

for i in range(n+1):
    graph[i].sort(reverse=True)

flag = [0] * (n + 1)

cnt=1
def DFS(start):
    global cnt
    flag[start] = cnt
    cnt += 1
    for i in graph[start]:
        if i != 0 and flag[i] == 0:
            DFS(i)



DFS(r)

for i in range(1, n+1):
    print(flag[i])