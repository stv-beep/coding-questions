//6. - sum array values
import java.util.Arrays;
public class 6sumArrayValues {

	public static void main(String[] args) {

		int[] arr = {5,7,9,6,3,5};
		

        //method 1
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("total: "+sum);
		

        //method 2 (java stream api)
        int sum2 = Arrays.stream(arr).sum();
		System.out.println("total 2: "+sum2);
		
	}

}
