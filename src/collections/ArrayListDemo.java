package collections;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void arrayListMethod1() {
		List<Integer> arrayList = new ArrayList<>(10);
		System.out.println(arrayList);

		for (int i = 1; i <= 10; i++)
			arrayList.add(i); // add
		System.out.println(arrayList);

		arrayList.remove(7); // remove

		for (int j = 0; j < arrayList.size(); j++)
			System.out.print(arrayList.get(j) + " "); // get

		System.out.println("\nAccessing elements using Enhanced for loop");

		for (int num : arrayList)
			System.out.print(num + " ");
	}

	public static void arrayListMethod2() {
		ArrayList evenNums = new ArrayList();
		evenNums.add(2);
		evenNums.add(4);
		evenNums.add(6);
		evenNums.add(8);

		ArrayList arrList = new ArrayList();
		arrList.add(11);
		arrList.add(19);
		arrList.add(0, 4);
		arrList.add("string1");
		arrList.add('c');
		arrList.addAll(0, evenNums);

		arrList.remove(0);

		// loop over elements of an arrayList
		for (int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}

	}

	public static void arrayListMethod3() {
		ArrayList arrList = new ArrayList();
		arrList.add(10);
		arrList.add(13);
		arrList.add(11);

		System.out.println("List contains 10: " + arrList.contains(10)); // true
		arrList.ensureCapacity(10);
		System.out.println("List size: " + arrList.size());
		System.out.println("index of 13 is : " + arrList.indexOf(13));

		ArrayList arrListClone = (ArrayList) arrList.clone();
		arrList.clear();
		System.out.println("arrList isEmpty ?: " + arrList.isEmpty());
		System.out.println("arrListClone isEmpty ?: " + arrListClone.isEmpty());
		// System.out.println(arrListClone);

		for (int i = 0; i < arrListClone.size(); i++) {
			System.out.print(arrListClone.get(i) + " ");

		}

	}

	public static void arrayListMethod4() {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(13);
		al.add(11);

		// System.out.println(arrListClone);
		// loops are not advised to use to traverse
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}

		System.out.println("\nUsing iterator");

		Iterator iter = al.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println("Using list iterator(forward)" + "\n");
		// listIter is available in list only
		// listIter allows to traverse forwards and backwards too.
		ListIterator listIter = al.listIterator();
		while (listIter.hasNext()) {
			Object o = listIter.next();
			System.out.println(o);
			if (o.equals(13)) {
				listIter.add(100);
			}
		}

		System.out.println("after adding 100 arraylist: " + al + "\n");

		// traversing backwards
		while (listIter.hasPrevious()) {
			Object o = listIter.previous();
			System.out.println(o);
			if (o.equals(100)) {
				listIter.add(99);
			}
		}
		
		System.out.println("after adding 99 arraylist: " + al + "\n");


	}

	public static void main(String[] args) {
		// arrayListMethod1();
		// arrayListMethod2();
		// arrayListMethod3();

		arrayListMethod4();
	}

}
