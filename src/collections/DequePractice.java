package collections;

import java.util.ArrayDeque;

public class DequePractice {
	
	public static void dequeMethod1() {
		ArrayDeque adq1 = new ArrayDeque(); 
		adq1.add(11); 
		adq1.addLast(100);
		adq1.addFirst(12);
		
		System.out.println("ArrayDeque after add mothods : " + adq1);
		
		ArrayDeque adq2 = new ArrayDeque(); 
		// offer  method may or may not insert values to the adq. 
		adq2.offer(3); 
		adq2.offerFirst(12); 
		adq2.offerLast(19);
		System.out.println("ArrayDeque after offer methods : " + adq2);
	}

	public static void main(String[] args) {
		dequeMethod1(); 
	}

}
