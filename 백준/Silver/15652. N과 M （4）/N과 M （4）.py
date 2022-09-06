from itertools import combinations_with_replacement
n,m = map(int,input().split())
lst = [i+1 for i in range(n)]
result = list(combinations_with_replacement(lst,m))
for item in result:
    print(*item)