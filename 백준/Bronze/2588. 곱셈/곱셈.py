a = int(input())
b = int(input())

blist = list(map(int, str(b)))

print(a*blist[2])
print(a*blist[1])
print(a*blist[0])
print(a*b)