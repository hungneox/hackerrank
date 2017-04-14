#!/bin/python3

import sys

n = int(input().strip()) # number of testcases

xs = list(map(int,input().split(' ')))
ys = list(map(int,input().split(' ')))

freq = {}

for y in ys:
    if y not in freq:
        freq[y] = 1
    else:
        freq[y] += 1

pairs = 0

for x in xs:
    if x in freq and freq[x] > 0:
        freq[x] -= 1
        pairs += 1

if pairs == n:
    pairs-=1
else:
    pairs+=1

print(pairs)