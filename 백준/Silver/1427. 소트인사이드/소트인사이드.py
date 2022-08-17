N = int(input())

nlist = list(map(int, str(N)))

nlist.sort(reverse=True)

for n in nlist:
    print(n, end="")