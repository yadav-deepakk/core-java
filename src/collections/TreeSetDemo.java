package collections;

import java.util.*;

public class TreeSetDemo {
	// previously added code.
	public static void treeSetMethod1() {
		TreeSet<String> tree_set = new TreeSet<String>();

		tree_set.add("A");
		tree_set.add("D");
		tree_set.add("H");
		tree_set.add("E");
		tree_set.add("F");
		tree_set.add("C");

		System.out.println(tree_set);
	}

	// newly added code.
	public static void treeSetMethod2() {
		LinkedList ll1 = new LinkedList();
		ll1.add(12);
		ll1.add(100);
		ll1.add(32);
		ll1.add(51);
		ll1.add(44);

		TreeSet ts = new TreeSet();
		ts.add(91);
		ts.add(100); // duplicated are not inserted into sets
		ts.addAll(ll1);

		System.out.println(ts);
		
		System.out.println();

		// will give higher and lower value of treeSet after that passed value.
		System.out.println("ts.higher(10): " + ts.higher(10));
		System.out.println("ts.lower(100): " + ts.lower(100));
		System.out.println("ts.higher(32): " + ts.higher(32));
		System.out.println("ts.lower(32): " + ts.lower(32));
		
		System.out.println();

		// acts similar to higher and lower but gives same value if passed argument
		// already exists.
		System.out.println("ts.floor(40): " + ts.floor(40));
		System.out.println("ts.ceiling(10): " + ts.ceiling(10));
		System.out.println("ts.floor(32): " + ts.floor(32));
		System.out.println("ts.ceiling(32): " + ts.ceiling(32));

	}

	public static void main(String[] args) {
		treeSetMethod2();
	}

}
