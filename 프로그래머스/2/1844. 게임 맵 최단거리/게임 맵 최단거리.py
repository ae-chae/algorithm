from collections import deque

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def solution(maps):
    answer = 0
    answer = BFS(0,0, maps)
    return answer

def BFS(x, y, maps):
    n, m = len(maps), len(maps[0])
    q = deque()
    q.append((x, y))

    while q:
        x, y = q.popleft()

        if x == n-1 and y == m-1:
            return maps[x][y]

        for i in range(4):
            cx = x + dx[i]
            cy = y + dy[i]

            if 0 <= cx < len(maps) and 0 <= cy < len(maps[0]) and maps[cx][cy] == 1:
                q.append((cx, cy))
                maps[cx][cy] = maps[x][y] + 1

    return -1
