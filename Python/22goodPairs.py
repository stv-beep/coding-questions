""" Leetcode 1512. Number of Good Pairs
Given an array of integers nums, return the number of good pairs. 
A pair (i, j) is called good if nums[i] == nums[j] and i < j. """

nums = [1,2,3,1,1,3]

def numIdenticalPairs(nums) -> int:
    goodPairs = 0
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            if i < j and nums[i] == nums[j]:
                goodPairs+=1
    return goodPairs


print(numIdenticalPairs(nums))
