N, K = list(map(int, input().split(' ')))
toys = sorted(list(map(int, input().split(' '))))
count = 0
for toy in toys:
    if K >= toy:
        count+=1
        K-=toy
        
print(count)