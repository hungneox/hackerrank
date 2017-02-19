#!/bin/python3

import sys

money, M = map(int, input().split(' ')) # number of testcases
coins = list(map(int, input().split(' ')))

def make_change(coins, money, index, memo):
    if (money == 0):
        return 1
    if index >= len(coins):
        return 0
    key = str(money) + '-' + str(index)
    if (key in memo):
        return memo.get(key)
    
    amount_with_coins = 0
    ways = 0
    while(amount_with_coins <= money):
        remaining = money - amount_with_coins
        ways += make_change(coins, remaining, index+1, memo)
        amount_with_coins += coins[index]
    memo[key] = ways
    return ways
        
if __name__ == '__main__':
    print(make_change(coins, money, 0, {}))