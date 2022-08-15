x, y = map(int, input().split())
1 <= x <= 12
1 <= y <= 31


month = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
day = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']
m = 0
sum = 0

for i in range(1, x):
    sum += month[i]

sum = sum + y

print(day[sum % 7])