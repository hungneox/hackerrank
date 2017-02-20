#!/bin/python
# https://www.hackerrank.com/challenges/camelcase
import sys

s = raw_input().strip()

s = s[0].upper() + s[1:]

print sum([1 for l in s if l == l.upper()])