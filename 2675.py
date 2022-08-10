a = int(input())

for i in range(a):
    b, l = input().split()
    lst = list(l)
    s = ""

    for i in range(len(lst)):
        c = lst[i]*int(b)
        s = s+c

    print(s)