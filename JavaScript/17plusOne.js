/* Leetcode 66. Plus One */
/* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits. */

/**
 * @param {number[]} digits
 * @return {number[]}
 */
 var plusOne = function(digits) {
    
    for (var i = digits.length-1; i >= 0; i--) {
        if (digits[i] < 9) { //no carry operation
          digits[i] = digits[i] +1;
          return digits
        } else {
          digits[i] = 0
        }
    }
    
    digits.unshift(1) //add 1 in case digits is = 0 0 0...
    return digits
};


plusOne([1,2,3]) //[1,2,4]
plusOne([4,3,2,1]) //[4,3,2,2]
plusOne([9]) //[1,0]
plusOne([6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3]) //[ 6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 4 ]