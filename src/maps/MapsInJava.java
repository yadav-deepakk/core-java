package maps;

import java.util.*;

public class MapsInJava {

	public static void main(String[] args) {
		// HashMap -> may or may not maintains order of insertion.
		HashMap map = new HashMap();
		
		// put method is used to insert an entry into map
		map.put(3, "Parth Singh");
		map.put(4, "Nitesh Singh");
		map.put(5, "Pravin Kumar");
		map.put(2, "Dara Singh"); // will be changed.
		map.put(null, null);
		map.put(1, "Deepak Kumar");
		map.put(2, "Tara Singh"); // will update previous value
		
		// get (key) method is used to get a value against a key. 
		System.out.println("value for key 1: " + map.get(1)); 

		// keySet()
		System.out.println("======== keySet ========");
		Set keySet = map.keySet();
		Iterator itr1 = keySet.iterator();
		while (itr1.hasNext()) {
			Integer key = (Integer) itr1.next(); 
			System.out.println(key);
		}

		// values();
		System.out.println("======== values ========");
		Collection collectValues = map.values();
		Iterator itr2 = collectValues.iterator();
		while (itr2.hasNext()) {
			String val = (String) itr2.next(); 
			System.out.println(val);
		}

		// EntrySet()
		System.out.println("======== EntrySet ========");
		Set entrySet = map.entrySet();
		Iterator itr3 = entrySet.iterator(); 
		while(itr3.hasNext()) {
			// iterator value
			Map.Entry entry = (Map.Entry) itr3.next(); 
			System.out.println("key:" + entry.getKey() + ", value:" + entry.getValue());
		}

		// for each loop
		System.out.println("======== ForEach loop ========");
		map.forEach((key, value) -> System.out.println("Roll No: " + key + ", Name: " + value));
		
		
		System.out.println("\n======== LinkedHashMap ========");
		// LinkedHashMap -> maintains order of insertion. 
		Map map1 = new LinkedHashMap(); 

		// put method is used to insert an entry into map
		map1.put(3, "Parth Singh");
		map1.put(4, "Nitesh Singh");
		map1.put(5, "Pravin Kumar");
		map1.put(2, "Dara Singh"); // will be changed.
		map1.put(null, null);
		map1.put(1, "Deepak Kumar");
		map1.put(2, "Tara Singh"); // will update previous value
		
		System.out.println(map1);

	}

}
