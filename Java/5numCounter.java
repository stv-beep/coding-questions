//5. - count numbers in a string
public class 4wordCounter {

	public static void main(String[] args) {
		
		String str = "aitgjr9eyje89yhj4589jw985jhw";
		
		String[] ch = str.split("");
		int counter = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (ch[i].matches("[0-9]+")) {
				counter++;
			}
		}
		
		System.out.println(counter+" numbers");
		
		
	}

}