#!/bin/python3
# https://www.hackerrank.com/challenges/sherlock-and-array

cases = int(input())

for i in range(cases):
    n = int(input())
    arr = list(map(int,input().split(' ')))
    total = sum(arr)
    sumLeft = 0
    found = False
    for j in range(1, n):
        sumRight = 0
        sumLeft += arr[j-1]
        sumRight = total - sumLeft - arr[j]
        if sumLeft == sumRight:
           found = True
           break
    if found or n == 1:
        print('YES')
    else:
        print('NO')