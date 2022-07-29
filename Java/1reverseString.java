//1. - Reverse string
public class 1reverseString {

	public static void main(String[] args) {
		
		
		/*method 1*/
		String str = "xoriso";
		
		for(int i = str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
		
		
		/*method 2*/
		String str2 = "xoriso";
		char c = ' ';
		String result = "";
		
		for(int i = 0; i<str.length(); i++) {
			c = str2.charAt(i);
			result = c + result;
		}
		System.out.println(result);
		
		
		/*method 3*/
		System.out.println(new StringBuilder(str).reverse().toString());
	}

}