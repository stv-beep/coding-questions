/* Leetcode 1678. Goal Parser Interpretation */
/* You own a Goal Parser that can interpret a string command. 
The command consists of an alphabet of "G", "()" and/or "(al)" in some order. 
The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". 
The interpreted strings are then concatenated in the original order.
Given the string command, return the Goal Parser's interpretation of command. */

public class Solution {
	

    //method 1
	public String interpret(String command) {
		String result = "";
		for (int i = 0; i < command.length(); i++) {
			if (command.charAt(i) == 'G') {
				result+= 'G';
			} else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
				result+='o';
			} else if (command.charAt(i) == '(' && command.charAt(i+1) == 'a') {
				result+="al";
			}
		}
		return result;
	}

    //method2
	public String interpret2(String command) {
        StringBuilder sb = new StringBuilder();
        int p = 0, q = 1;
        for (; p < command.length(); p++, q++) {
            char c = command.charAt(p);
            if (c == 'G') sb.append('G');
            if (c == '(') {
                if (command.charAt(q) == ')') {
                    sb.append("o");
                    p++;
                    q++;
                } else {
                    sb.append("al");
                    p += 2;
                    q += 2;
                }
            }
        }
        return sb.toString();
    }

    String command = "G()(al)";
    String command1 = "(al)G(al)()()G";
	System.out.println(solution.interpret(command)); //Goal
    System.out.println(solution.interpret2(command1)); //alGalooG
}