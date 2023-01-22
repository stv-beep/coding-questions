/* FreeCodeCamp */
/* JavaScript Algorithms and Data Structures Projects but with JAVA*/

public class Solution {
    public String convertToRoman(int num) {
        int[] dec = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String result = "";
        
        for (int i = 0; i < dec.length; i++) {
            while (num >= dec[i]) {
                result+=roman[i];
                num -= dec[i];
            }
        }
        return result;
    }

    System.out.println(solution.convertToRoman(36));
}
