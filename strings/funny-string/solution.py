# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(raw_input())

def solve(strS):
    strR = strS[::-1]
    for j in xrange(1, len(strS)):
        if abs(ord(strS[j]) - ord(strS[j-1])) != abs(ord(strR[j]) - ord(strR[j-1])):
            return False
    return True

for i in xrange(n):
    strS = raw_input();
    if(solve(strS)):
        print 'Funny'
    else:
        print 'Not Funny'