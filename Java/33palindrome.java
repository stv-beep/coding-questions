/* FreeCodeCamp */
/* JavaScript Algorithms and Data Structures Projects but with JAVA */
/* Return true if the given string is a palindrome. Otherwise, return false.
A palindrome is a word or sentence that's spelled the same way both forward and backward, ignoring punctuation, case, and spacing.
Note: You'll need to remove all non-alphanumeric characters (punctuation, spaces and symbols) and turn everything into the same case (lower or upper case) in order to check for palindromes.
We'll pass strings with varying formats, such as racecar, RaceCar, and race CAR among others.
We'll also pass strings with special symbols, such as 2A3*3a2, 2A3 3a2, and 2_A3*3#A2. */

public class Solution {
    public boolean palindrome(String str) {
        String normalTxt = str.replaceAll("[^a-zA-Z0-9]", "");
        String reversed = "";
        
        for (int i = normalTxt.length()-1; i >= 0; i--) {
            reversed+=normalTxt.charAt(i);
        }
        return reversed.equals(normalTxt);
    }

    System.out.println(solution.palindrome("_eye"));
	System.out.println(solution.palindrome("not a palindrome"));
}