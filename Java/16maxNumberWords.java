/* Leetcode 2114. Maximum Number of Words Found in Sentences*/
/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
You are given an array of strings sentences, where each sentences[i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.*/

public class Main {
	
	public static int mostWordsFound(String[] sentences) {
        int[] s = new int[sentences.length];
        int words = 0;
        for (int i = 0; i < sentences.length; i++) {
            words = sentences[i].split(" ").length;
            s[i] = words;
        }
        int max = 0;
        for (int j = 0; j < s.length; j++) {
        	if (s[j] > max) {
        		max = s[j];
        	}
        }
        return max;
    }
	
	public static void main(String[] args) {
		
		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		
		mostWordsFound(sentences);
	}

}