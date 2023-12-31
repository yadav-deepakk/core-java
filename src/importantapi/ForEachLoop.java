package importantapi;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEachLoop {

	public static void main(String[] args) {
		// collections
		List al1 = new ArrayList();
		al1.add(10);
		al1.add(11);
		al1.add(18);
		al1.add(9);

		Consumer<Integer> consumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.println(i);
			}
		};

		al1.forEach(consumer);

		Set set1 = new HashSet();
		set1.add(100);
		set1.add(10);
		set1.add(101);
		set1.add(119);
		set1.add(9);
		set1.add(19);

		System.out.println();
		set1.forEach(element -> System.out.println(element));

		// map
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Deepak");
		map1.put(2, "Parth");
		map1.put(4, "Nitesh");
		map1.put(3, "Shivam");
		map1.put(5, "Akash");

		BiConsumer<Integer, String> biConsumer = new BiConsumer<Integer, String>() {
			public void accept(Integer key, String val) {
				System.out.println("Key=" + key + ", Value=" + val);
			}
		};

		System.out.println();
		map1.forEach(biConsumer);

	}

}
