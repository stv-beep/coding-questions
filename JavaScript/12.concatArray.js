/* Leetcode 1929. Concatenation of Array*/
/*Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans. */

//method 1
/**
 * @param {number[]} nums
 * @return {number[]}
 */
 var getConcatenation = function(nums) {
     
    return nums.concat(nums)
};

getConcatenation([1,2,1])
getConcatenation([1,3,2,1])

//method 2
var getConcatenation = function(nums) {
    var ans = []
    
    ans.push(...nums, ...nums)
    return ans
};

//method 3
var getConcatenation = function(nums) {
    var ans = []
    
    for (var i = 0; i < nums.length; i++) {
      ans.push(nums[i])
    }
  	for (var i = 0; i < nums.length; i++) {
      ans.push(nums[i])
    }
    return ans
};