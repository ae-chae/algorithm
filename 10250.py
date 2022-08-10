T = int(input())
for i in range(T):
    H, W, N = map(int, input().split())

    a = N//H + 1 # 호수
    b = N%H # 층수
    if N%H == 0:
        a = N//H
        b = H

    print(b*100+a)