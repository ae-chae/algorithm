T = int(input())

A, B, C = 300, 60, 10

if T%10 != 0:
    print(-1)
else:
    x = T//A
    y = (T%A)//B
    z = ((T%A)%B)//C
    print(x, y, z)