n = int(input())
lst = [list(map(int, input().split())) for _ in range(n)]

result = sorted(lst, key=lambda x: (x[1] * x[2] * x[3], x[1] + x[2] + x[3], x[0]))
for i in range(3):
    print(result[i][0], end=" ")