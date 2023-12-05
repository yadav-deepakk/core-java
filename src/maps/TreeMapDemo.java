package maps;

import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> tree_map = new TreeMap<String, Integer>();

		tree_map.put("B",2);
		tree_map.put("C",1);
		tree_map.put("A",3);
		
		System.out.println(tree_map);
		
		for (Entry<String, Integer> entry : tree_map.entrySet()) {
			System.out.println("key=" + entry.getKey() + " " + "value=" + entry.getValue());
		}
		

	}

}
