/* Leetcode 66. Plus One */
/* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits. */

public class Main {
	
	public static int[] plusOne(int[] digits) {
		for (int i = digits.length-1; i >= 0; i--) {
			if (digits[i] < 9) {//no carry
				digits[i] = digits[i]+1;
				return digits;
			} else {
                digits[i] = 0;
            }	
		}
		
        int[] arr = new int[digits.length+1];
        arr[0] = 1;
				
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] digits = {1,2,3};
		int[] digits3 = {9};
		
		System.out.println(plusOne(digits));
		System.out.println(plusOne(digits3));
	}

}
