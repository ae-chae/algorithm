N, M = map(int, input().split())

n = set()
m = set()

for _ in range(N):
	n.add(input())

for _ in range(M):
	m.add(input())

un = set() # n과 m의 교집합
un = sorted(list(n & m))

print(len(un))

for i in un:
    print(i)
