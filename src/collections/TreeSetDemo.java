package collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> tree_set = new TreeSet<String>();
		
		tree_set.add("A");
		tree_set.add("D");
		tree_set.add("H");
		tree_set.add("E");
		tree_set.add("F");
		tree_set.add("C");
		
		System.out.println(tree_set);
	}

}
