#!/usr/local/bin/python3
# Slow
def lcs(xs, ys):
    '''Return a longest common subsequence of xs and ys.
    
    Example
    >>> lcs("HUMAN", "CHIMPANZEE")
    ['H', 'M', 'A', 'N']
    '''
    if xs and ys:
        *xb, xe = xs
        *yb, ye = ys
        if xe == ye:
            return lcs(xb, yb) + [xe]
        else:
            return max(lcs(xs, yb), lcs(xb, ys), key=len)
    else:
        return []

if __name__ == '__main__':
    m, n = map(int, input().split(' ')) # number of testcases
    seq1 = input()
    seq2 = input()
    print("".join(lcs(seq1, seq2)).replace("  ", " "))