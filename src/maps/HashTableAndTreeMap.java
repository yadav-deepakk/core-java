package maps;

import java.util.*;

public class HashTableAndTreeMap {

	public static void main(String[] args) {

		// hash-tables in java are synchronized and thread safe.
		// they do not allow to map key=null and value=null;
		Hashtable ht = new Hashtable();
		// ht.put(1, null); // -> key or value can not be null.
		// ht.put(null, "Name"); -> key or value can not be null.
		ht.put(12, "Deepak");
		ht.put(1, "Deep");
		ht.put(2, "Raj");
		ht.put(11, "Rohan");
		System.out.println(ht);

		// TreeMap -> uses a binary search tree to store key-value
		// tree is traversed Inorder - LVR.
		// so we get sorted output based on key
		Map tm = new TreeMap();
		tm.put(1, "A");
		tm.put(3, "B");
		tm.put(9, "D");
		tm.put(11, "Q");
		tm.put(4, "P");
		System.out.println(tm);
	}

}
