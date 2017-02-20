#!/bin/python3

import sys

# https://www.hackerrank.com/challenges/beautiful-binary-string
n = int(input().strip())
B = input().strip()
count = 0

def replace_and_count(inpt):
    si = inpt.find("010")
    if (si != -1):
        temp = list(inpt)
        temp[si+2] = "1"
    return ''.join(temp)

if __name__ == "__main__":
    inpt = B
    while(inpt.find("010") != -1):
        inpt = replace_and_count(inpt)
        count +=1

    print(count)