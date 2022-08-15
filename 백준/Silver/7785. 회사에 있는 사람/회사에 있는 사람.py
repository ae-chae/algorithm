import sys

s = set()
for _ in range(int(sys.stdin.readline())):
    name, log = sys.stdin.readline().split()
    if log == "enter":
        s.add(name)
    elif log == "leave":
        s.remove(name)

for i in sorted(s, reverse=True):
    print(i)