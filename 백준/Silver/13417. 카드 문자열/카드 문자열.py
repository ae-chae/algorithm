import sys

t = int(sys.stdin.readline())

for _ in range(t):
    res = []
    n = int(sys.stdin.readline())
    c = sys.stdin.readline().split()

    res.append(c[0])

    for i in range(1, n):
        if ord(res[0]) < ord(c[i]):
            res.append(c[i])

        else:
            res.insert(0, c[i])


    print(''.join(res))