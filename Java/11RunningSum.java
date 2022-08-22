/* Leetcode 1480. Running Sum of 1d Array */
/* Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums. */

public class Main {

	public static int[] runningSum(int[] nums) {
	        for (int i = 0; i < nums.length-1; i++) {
	        	int temp = nums[i] + nums[i+1];
	        	
	        	nums[i+1] = temp;
	        }
	        
			return nums;
	    }
	
	
	public static void main(String[] args) {
		
		
		int[] arr11 = {1,2,3,4};
		
		runningSum(arr11);
		
	}

}
