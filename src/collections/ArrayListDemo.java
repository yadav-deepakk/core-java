package collections;

import java.util.List;
import java.util.ArrayList;

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

	public static void main(String[] args) {
		arrayListMethod1(); 
		arrayListMethod2();
	}

}
