while True :
    lst = []

    x, y, z = map(int, input().split())
    lst.append(x)
    lst.append(y)
    lst.append(z)

    m = max(lst)

    if (x == 0 and y == 0 and z == 0):
        break

    lst.remove(m)
    if lst[0] ** 2 + lst[1] ** 2 == m ** 2:
        print('right')
    else:
        print('wrong')