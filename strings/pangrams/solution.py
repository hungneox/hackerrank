#!/bin/python
# https://www.hackerrank.com/challenges/pangrams

import sys
import string
alphabet = list(string.ascii_lowercase)
s = list(raw_input().lower().strip().replace(' ', ''))
not_pangram = False

for l in alphabet:
    if l not in s:
        not_pangram = True

if not_pangram:
    print 'not pangram'
else:
    print 'pangram'