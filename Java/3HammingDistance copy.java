//3. - Hamming distance
public class 3HammingDistance {

	public static void main(String[] args) {
		
		String str1 = "patete";
		String str2 = "patata";
		
		int diff = 0;
		
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					diff++;
				}
			}
			System.out.println(diff);
		} else {
			System.out.println("Different lengths");
		}
		
		
	}

}