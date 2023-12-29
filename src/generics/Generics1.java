package generics;

import java.util.*;

public class Generics1 {
	public static void main(String[] args) {
		// generic - it is used to ensure type safety.
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(100);
		arrList.add(120);
		arrList.add(101);
		// will not allow to add string in an integer type array-list.
		// arrList.add("109");
		arrList.add(121);
		arrList.add(105);
		System.out.println(arrList);
	
		ArrayList<String> arrList1 = new ArrayList<String>(); 
		List<String> arrayList2 = new ArrayList<String>(); 
		Collection<String> arrayList3 = new ArrayList<String>(); 
		
		// down-casting is not allowed in generic.
		// ArrayList<Object> arrayList = new ArrayList<String>(); 
	}
}
