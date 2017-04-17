#https://www.hackerrank.com/challenges/sam-and-substrings/editorial
n = int(input())
for i in range(n):
    T = int(input())
    seq = list(map(int, input().split(' ')))
    max_contiguous = seq[0]
    local_max = seq[0]
    if (len([x for x in seq if x > 0]) > 0):
        max_non_contiguous = sum([x for x in seq if x > 0])
    else:
        max_non_contiguous = max(seq)
        
    for j in range(1, len(seq)):
        local_max = max(seq[j], seq[j] + local_max)
        max_contiguous = max(max_contiguous, local_max)

    print(max_contiguous, max_non_contiguous)