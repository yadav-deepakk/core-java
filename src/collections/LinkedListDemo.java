package collections;

import java.util.*;

public class LinkedListDemo {

	public static void linkedListMethod1() {
		LinkedList<Integer> linked_list = new LinkedList<Integer>();

		linked_list.add(10);
		linked_list.add(112);
		linked_list.add(12);
		linked_list.add(2);
		linked_list.addFirst(30); // First location
		linked_list.addLast(17); // Last location
		linked_list.add(1, 13); // index, value

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

	public static void linkedListMethod2() {
		LinkedList ll1 = new LinkedList();
		ll1.add(7);
		ll1.add(10);
		ll1.add(17);
		ll1.add(19);

		ll1.add(1, 77);
		ll1.indexOf(7);
		ll1.addFirst(0);
		ll1.addLast(100);

		System.out.println(ll1);

		ll1.remove(3);
		ll1.removeFirst();
		ll1.removeLast();

		System.out.println(ll1);
	}

	public static void linkedListMethod3() {
		// will give only Deque related methods
		Deque ll1 = new LinkedList();

		ll1.addFirst(1);
		ll1.addLast(100);
		
		// will give only List related methods
		List ll2 = new LinkedList();
		ll2.add(0, ll2);
		
		
		// will give both Deque and List related methods. 
		LinkedList ll3 = new LinkedList();
		ll2.add(0, ll2);

		ll1.addFirst(12);
		ll1.addLast(52);
		

	}

	public static void main(String[] args) {
		// linkedListMethod2();
		linkedListMethod3(); 
	}

}
