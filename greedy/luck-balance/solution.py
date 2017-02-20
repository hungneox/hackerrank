#!/bin/python3
# https://www.hackerrank.com/challenges/luck-balance

n, k = map(int, input().split(" "))

nrml = []
impt = []

for i in range(n):
    l, t = map(int, input().split(" "))
    if (t == 0): nrml.append(l)
    else: impt.append(l)

must_win = max(0, len(impt) - k)
total_luck = sum(nrml)

impt = sorted(impt)
       
print(total_luck + sum(impt[must_win:]) - sum(impt[:must_win]))