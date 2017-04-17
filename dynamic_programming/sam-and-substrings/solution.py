import itertools

def cal_sub_string(arr, size):
    local_total = 0
    if size == 1:
        local_total = sum(map(int, arr))
    else:
        for j in range(0, len(arr), size-1):
            # print("j: %s - size: %s" % (j, size))
            num = ''
            if (j+size > len(arr)):
                break
            for k in range(0, size):
                num = str(num) + str(arr[j+k])
            # print('num: %s' % num)
            local_total += int(num)
    return local_total

def solve(arr):
    total = 0
    for i in range(len(arr)):
        total += cal_sub_string(arr, i+1)

    return total

n_balls = list(input();

print(solve(n_balls))

# s = raw_input()
# n = len(s)
# candies = 0
# mul = 1
# MOD = 1000000007
# for index in xrange(n - 1, -1, -1):
#     candies = (candies + (ord(s[index]) - ord('0')) * mul *(index + 1)) % MOD
#     mul = (mul * 10 + 1) % MOD
# print candies
