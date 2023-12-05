package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>(10);

		map.put('a', 10);
		map.put('b', 20);
		map.put('c', 30);

		System.out.println("Size of the map: " + map.size());
		System.out.println(map);

		System.out.println(map.containsKey('a') ? map.get('a') : "Key is not presen in map!!!");

		System.out.println("\nAccessing elements using keyset");
		for (char key : map.keySet())
			System.out.println("Key=" + key + ", " + "Value=" + map.get(key));

		System.out.println("\nAccessing elements using EntrySet");
		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println("Key=" + entry.getKey() + ", " + "Value=" + entry.getValue());
		}

	}

}
