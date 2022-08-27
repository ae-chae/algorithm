n = int(input())

dp = [0] * 91

dp[1] = 1 # 첫 번째 항
dp[2] = 1 # 두 번째 항

for i in range(3, 91):
    dp[i] = dp[i-1] + dp[i-2]

print(dp[n])