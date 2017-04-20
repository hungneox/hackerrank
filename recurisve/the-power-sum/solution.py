def solve(x, n, base, sigma):
    current = base ** n
    if (sigma + current == x):
        return 1
    elif (sigma > x or current > x):
        return 0
    else:
        return solve(x, n, base+1, sigma) + solve(x, n, base+1, sigma+current)
    
x = int(input())
n = int(input())

print(solve(x, n, 1, 0))