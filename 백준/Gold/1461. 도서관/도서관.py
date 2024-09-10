N, M = map(int, input().split())
arr = list(map(int, input().split()))

neg = []
pos = []
for x in arr:
    if x < 0:
        neg.append(-x)
    else:
        pos.append(x)

dist = []
pos = sorted(pos, reverse=True)
neg = sorted(neg, reverse=True)

for n in neg[::M]:
    dist.append(n)
for p in pos[::M]:
    dist.append(p)

answer = 2 * sum(dist) - max(dist)
print(answer)
