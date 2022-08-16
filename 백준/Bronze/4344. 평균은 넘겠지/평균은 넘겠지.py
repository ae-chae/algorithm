C = int(input())

for _ in range(C):
    num = list(map(int, input().split()))
    avg = sum(num[1:])/num[0]
    cnt = 0
    for score in num[1:]:
        if score > avg:
            cnt += 1
    rate = cnt/num[0] * 100
    print(f'{rate:.3f}%')