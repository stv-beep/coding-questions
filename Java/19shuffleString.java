/* Leetcode 1528. Shuffle String */
/* You are given a string s and an integer array indices of the same length. 
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string. */

public class Main {
	
	public static String restoreString(String s, int[] indices) {
		int n = s.length();
		char[] t = new char[n];
		
		for (int i = 0; i < n; i++) {
			t[indices[i]] = s.charAt(i);
		}
		return s = new String(t);
	}
	
	public static void main(String[] args) {
		
		int[] indices = {4,5,6,7,0,2,1,3};
		
		System.out.println(restoreString("codeleet",indices));//leetcode
	}

}
