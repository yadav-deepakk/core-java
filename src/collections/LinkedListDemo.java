package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> linked_list = new LinkedList<Integer>();
		
		linked_list.add(10);
		linked_list.add(112);
		linked_list.add(12);
		linked_list.add(2);
		linked_list.addFirst(30);	// First location
		linked_list.addLast(17);	// Last location
		linked_list.add(1, 13);		// index, value
		
		System.out.println(linked_list);
		
		linked_list.remove();
		System.out.println("After remove(): " + linked_list);

		linked_list.removeFirst();
		System.out.println("After removeFirst(): " + linked_list);

		linked_list.removeLast();
		System.out.println("After removeLast(): " + linked_list);

		linked_list.remove(2);
		System.out.println("After remove(2): " + linked_list);
		
	}

}
