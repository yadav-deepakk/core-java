package collections;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
	
	public static void priorityQueuemethod1() {
		// pq maintains order by using min-heap data structure.  
		PriorityQueue pq = new PriorityQueue(); 
		
		pq.add(100); 
		pq.add(125); 
		pq.add(75); 
		pq.add(20); 
		pq.add(25); 
		pq.add(88); 

		System.out.println(pq);
		
	}

	public static void main(String[] args) {
		priorityQueuemethod1(); 
	}

}
