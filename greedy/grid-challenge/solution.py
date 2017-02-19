#!/bin/python3

import sys

T = int(input().strip()) # number of testcases
for t in range(T):
    N = int(input().strip()) # number of lines
    grid = []
    for n in range(N):
        line = input().strip()
        grid.append(sorted(list(line)))
    no = False
    for i in range(len(grid)-1):
        for l in range(len(grid[0])):
            if (grid[i][l] > grid[i+1][l]):
                no = True
    if (no):
        print('NO')
    else:
        print('YES')