a = int(input())

for i in range(0,a):
    lst = list(input())
    cnt = 0
    score = 1

    for j in lst:
        if j == 'O':
            cnt += score
            score += 1
        else:
            score = 1
    print(cnt)
