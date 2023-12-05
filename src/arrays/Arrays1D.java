package arrays;

import java.util.HashMap;
import java.util.Map;

public class Arrays1D {
	
	public static void missingElement() {
		int arr[] = {1,2,4,5,7,6};
		int N = arr.length;
		int arrSum = 0;
		for(int i=0; i<N; i++) arrSum+=arr[i];
		int sumN = ((N+2)*(N+1))/2;
		
		System.out.println("Missing Element: " + (sumN - arrSum));
	}

	public static void main(String[] args) {
		
		missingElement();
		
		Map<String, Integer> mp = new HashMap<String, Integer>();
		System.out.println(mp.equals(mp)); 
		
		
		String s = new String("Hello World!"); 
		
		System.out.println(10/10);
	}
}
