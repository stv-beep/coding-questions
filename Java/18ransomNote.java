/* Leetcode 383. Ransom Note*/
/* Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine 
and false otherwise.
Each letter in magazine can only be used once in ransomNote. */

public class Main {
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		
		if (ransomNote.length() > magazine.length()) {
			return false;
		} else {
			char[] ransomArray = ransomNote.toCharArray();
			
			for (int i = 0; i < ransomArray.length; i++) {
				if (magazine.contains(Character.toString(ransomArray[i]))) {
					magazine = magazine.replaceFirst(Character.toString(ransomArray[i]), "");
				} else {
					return false;
				}
			}		
			
		}
		return true;
	}
	
    public static void main(String[] args) {
        
        
        System.out.println(canConstruct("a","b"));//false
        System.out.println(canConstruct("aa","ab"));//false
        System.out.println(canConstruct("aa","aab"));//true
        
    }

}
