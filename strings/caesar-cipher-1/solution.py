#!/bin/python3
# https://www.hackerrank.com/challenges/caesar-cipher-1
import sys
import string

n = int(input().strip())
s = input().strip()
k = int(input().strip())

new_string = ''

k =  k % 26 if (k > 26) else k

for letter in s:
    a = 'a'
    z = 'z'
    if letter in string.ascii_uppercase:
        a = 'A'
        z = 'Z'
    if letter not in string.ascii_letters:
        new_string += letter
        continue
    if (ord(letter) + k <= ord(z)):
        new_string += chr(ord(letter) + k)
    else:
        new_string += chr(ord(a) + (ord(letter) - ord(z)) + (k - 1))


print(new_string)