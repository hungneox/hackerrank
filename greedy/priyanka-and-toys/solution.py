n = int(input())
toys = sorted(list(map(int, input().split(' '))))
current = toys[0]
count = {}
for i in range(len(toys)):
    if toys[i] in range(current, current+5):
        if (current not in count):
            count[current] = 1
        else:
            count[current] += 1
    else:
        current = toys[i]
        if (current not in count):
            count[current] = 1
print(len(count))
    