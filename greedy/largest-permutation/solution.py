N, K = list(map(int, input().split(' ')))
nums = list(map(int, input().split(' ')))
# last case time out
i = 0
temp = 0
if (len(nums) == 2):
    if nums[0] < nums[1]:
        num[0], num[1] = num[1], num[0]
    K = 0

if K > N:
    nums = sorted(nums, reverse=True)
    K = 0

while K > 0:
    if (i+1 == len(nums)):
        K = 0
        break
    max_of_the_rest = max(nums[i+1::])
    max_index = nums.index(max_of_the_rest)
    if (nums[i] < max_of_the_rest):
        nums[i], nums[max_index] = max_of_the_rest, nums[i]
        K = K - 1
    i+=1
        
print(" ".join(map(str,nums)))
    