n = int(input())
numbers = list(map(int, input().split()))
dp = [0] * n
dp[0] = 1

for i in range(1, n):
    best = 0
    for j in range(n-1):
        if numbers[i] > numbers[j]:
            best = max(best, dp[j])
    dp[i] = best + 1

print(max(dp))