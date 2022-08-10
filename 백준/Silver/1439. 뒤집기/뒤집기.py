S = input()

cnt = 0
pre = ""

for i in S:
    if i != pre:
        pre = i
        cnt += 1

print((cnt)//2)