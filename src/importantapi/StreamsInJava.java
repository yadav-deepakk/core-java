package importantapi;

import java.util.*;
import java.util.stream.*;

public class StreamsInJava {

	public static void main(String[] args) {
		List<Integer> arrList = Arrays.asList(2,4,6,8); 
		Stream<Integer> streamData = arrList.stream(); 
		// streamData.forEach( n -> System.out.println(n));
		
		List<Integer> arrList1 = Arrays.asList(9,5,33,66,11,99); 
		Stream<Integer> strm1 = arrList1.stream()
				.filter(n->n%2!=0)
				.map(n->n*2)
				.sorted();

		strm1.forEach(n->System.out.println(n));
	}

}
