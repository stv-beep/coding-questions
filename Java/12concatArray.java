/* Leetcode 1929. Concatenation of Array */
/* Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans. */

public class Main {
    
    public static int[] getConcatenation(int[] nums) {
		
        int[] ans = new int[nums.length * 2];
        
        for (int i = 0; i < nums.length; i ++) {
            ans[i] = nums[i];
        }
        
        for (int j = ans.length/2; j < ans.length; j++) {
            ans[j] = nums[j-ans.length/2];
        }
        
        return ans;
        }
    
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,1};
        
        getConcatenation(arr1);
    
    }
}
