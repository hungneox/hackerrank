def fib(n):
    if (n == 1):
        return mot
    if (n == 2):
        return hai
    if (n == 3):
        return mot + hai**2
    if (n > 3):
        return fib(n-2) + fib(n-1)**2
    
dulieu = list(map(int, input().split(' ')))
mot = dulieu[0]
hai = dulieu[1]
n = dulieu[2]
print(fib(n))
              
