#!/bin/python
# https://www.hackerrank.com/challenges/camelcase
import sys

# input: saveChangesInTheEditor
# 1. save
# 2. Changes
# 3. In
# 4. The
# 5. Editor
# output: 5

s = raw_input().strip()

s = s[0].upper() + s[1:]

print sum([1 for l in s if l == l.upper()])