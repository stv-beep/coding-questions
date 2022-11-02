/* Leetcode 1512. Number of Good Pairs */
/* Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j. */

public class Solution {
		
	public int numIdenticalPairs(int[] nums) {
		int goodPairs = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j] && i < j) {
					goodPairs++;
				}
			}
		}
		return goodPairs;
	}

    int[] nums = {1,2,3,1,1,3};
    int[] nums1 = {1,1,1,1};
    
    System.out.println(solution.numIdenticalPairs(nums)); //4
    System.out.println(solution.numIdenticalPairs(nums1)); //6
}
