#!/bin/python

import sys

le_tokens = {'{': '}', '[': ']', '(':')'}

def match(token1, token2):
    return le_tokens[token1] == token2
    
def is_open_term(token):
    return token in ['{', '[', '(']
    
def is_balance(exp):
    if (len(exp) == 0):
        return False
    
    stack = []
    for i in range(len(exp)):
        if is_open_term(exp[i]):
            stack.append(exp[i])
        else:
            if not stack:
                return False
            
            top = stack.pop()
            if match(top, exp[i]) == False:
                return False
    return True if not stack else False 
                
if __name__ == '__main__':
    t = int(input().strip())
    for i in range(t):
        s = input().strip()
        if (is_balance(s)):
            print('YES')
        else:
            print('NO')