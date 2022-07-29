public class 7fibonacci {

	public static void main(String[] args) {
		
		//7. - fibonacci
		int number = 10;
			
		
		int[] first = {0, 1};
		int sum = 0;
		
		for (int i = 1; i < number; i++) {
			
			System.out.println(sum);
			sum = first[0] + first[1];
			first[0] = first[1];
			first[1] = sum;
					
		}
		
		System.out.println("Last fibonacci sum: "+first[1]);
		
		
	}

}
