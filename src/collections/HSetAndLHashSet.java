package collections;

import java.util.*;

public class HSetAndLHashSet {

	public static void hashSetMethod1() {
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

	public static void hashSetMethod2() {
		// do not preserve order in which elements are entering into set.
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(123);
		hs.add(100); // duplicates are not inserted into any set.
		hs.add(12);
		hs.add(10);
		hs.add(13);

		boolean is100InseterdIntoHashSet = hs.add(100);
		System.out.println("100 inserted: " + is100InseterdIntoHashSet + "\n");
		
		System.out.println(hs);
	}

	public static void linkedHashSetMethod1() {
		// preserves the order in which elements are entering into set
		LinkedHashSet lhashSet = new LinkedHashSet();
		lhashSet.add(100);
		lhashSet.add(123);
		lhashSet.add(100); // duplicates are not inserted into any set.
		lhashSet.add(12);
		lhashSet.add(10);
		lhashSet.add(13);

		System.out.println(lhashSet);
	}

	public static void main(String[] args) {
		hashSetMethod2();
		System.out.println();
		linkedHashSetMethod1();
	}

}
