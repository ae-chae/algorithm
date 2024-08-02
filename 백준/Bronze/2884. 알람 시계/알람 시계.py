H, M = map(int, input().split())
0 <= H <= 24
0 <= M <= 60

if (M-45) >= 0:
    print(H,M-45)
else:
    if H == 0:
        print("23",M+15)
    else:
        print(H-1,M+15)