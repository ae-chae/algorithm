x = int(input())
y = int(input())
z = int(input())

a = (str(x*y*z))
list = [0]*10

for i in a:
    list[int(i)] += 1

for i in list:
    print(i)
