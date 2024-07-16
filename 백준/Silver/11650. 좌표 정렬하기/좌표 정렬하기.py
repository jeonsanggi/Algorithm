n = int(input())
lst = [list(map(int, input().split(" "))) for _ in range(n)]
result = sorted(lst)
for x, y in result:
    print(x, y, sep=' ')