//2. - count character repetitions
public class 2charCounter {

	public static void main(String[] args) {
		
		String text = "himmel";
		char letter = 'm';
		int counter = 0;
		
		for (int i = 0; i < text.length(); i++) {
			if (text.toLowerCase().charAt(i) == letter) {
				counter++;
			}
		}
		
		System.out.println(letter+" character appears "+counter+" times");
		
		
	}

}