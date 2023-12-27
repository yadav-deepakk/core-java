package maps;

import java.util.*;

public class MapsInJava {

	public static void main(String[] args) {

		// HashMap -> may or may not maintains order of insertion.
		HashMap map = new HashMap();

		map.put(3, "Parth Singh");
		map.put(4, "Nitesh Singh");
		map.put(5, "Pravin Kumar");
		map.put(2, "Dara Singh"); // will be changed.
		map.put(null, null);
		map.put(1, "Deepak Kumar");
		map.put(2, "Tara Singh"); // will update previous value

//		System.out.println(map);
		map.forEach((key, value) -> System.out.println("Roll No: " + key + ", Name: " + value));

	}

}
