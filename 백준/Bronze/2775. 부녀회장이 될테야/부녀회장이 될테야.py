T = int(input())

for i in range(T):
    k = int(input()) 
    n = int(input())

    floor0 = [x for x in range(1, n+1)]
    for j in range(k):
        for i in range(1,n):
            floor0[i] += floor0[i-1]
    print(floor0[-1])
