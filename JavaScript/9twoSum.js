/* Leetcode 1. Two Sum */
/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order. */

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
 var twoSum = function(nums, target) {
    
    for (var i = 0; i < nums.length; i++) {
      var temp = target - nums[i]
      var index = nums.indexOf(temp, i+1)
      if (index != -1 || index == 0) {
        return [i,index]
      }
    }
};

twoSum([2,7,11,15],9)   //[0,1]
twoSum([3,2,4],6) 		//[1,2]
twoSum([3,3],6) 	    //[0,1]
twoSum([3,2,3],6) 		//[0,2]