//8. - Square of symbols
public class Main {

	public static void main(String[] args) {
		
		int n = 5;
		String square = "";
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				square += "+";
			}
			square += "\n";
		}
		
		System.out.println(square);
		
	}

}