import collections

n = int(input())
a = collections.Counter(list(map(int, input().split(' '))))
m = int(input())
b = collections.Counter(list(map(int, input().split(' '))))

a.subtract(b)
c = [x for x in a if a[x]]
print(*sorted(c))