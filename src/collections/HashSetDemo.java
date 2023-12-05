package collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hash_set = new HashSet<String>(5);
		System.out.println(hash_set.add("C"));
		System.out.println(hash_set.add("A"));
		System.out.println(hash_set.add("D"));
		System.out.println(hash_set.add("A"));

		System.out.println(hash_set);
		
		System.out.println(hash_set.contains("F"));
		System.out.println(hash_set);
		
		System.out.println(hash_set.remove("F"));
		System.out.println(hash_set);

	}

}
