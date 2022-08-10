N = int(input())
count = 0

for i in range(N):
    s = input()
    for j in range(len(s)-1):
        if s[j] != s[j+1]:
            new = s[j+1:]
            if s[j] in new:
                count -= 1
                break
    count += 1

print(count)

