package datastructures;

class QueueNode{
	int data;
	public QueueNode next;
	
	QueueNode(){ 
		this.next = null; 
	}
	
	QueueNode(int data){
		this.data = data;
		this.next = null;
	}
}

class Queue{
	
	private QueueNode front;
	private QueueNode rear;
	
	public Queue() {
		this.front = null;
		this.rear = null;
	}
	
	public Queue(int fData){
		this.front = new QueueNode(fData);
		this.rear = null;
		this.front.next = this.rear;
	}
	
	public Queue(int fData, int rData){
		this.rear = new QueueNode(rData);
		this.rear.next = null;
		this.front = new QueueNode(fData);
		this.front.next = this.rear;
	}
	
	public Queue(int fData, int... elements) {
		this();
		this.insert(fData);
		for (int element : elements) {
			this.insert(element);
		}
	}
	
	public long length() {
		long n = 0;
		QueueNode p = this.front;
		while(p!=null) {
			p = p.next;
			n++;
		}
		return n;
	}
	
	public void insert(int data) {
		QueueNode newNode = new QueueNode(data);
		if(front == null && rear == null) {
			System.out.println("Front=Rear=Null, So making "+ data + " as Front and Rear=Null");
			this.front = newNode;
			this.front.next = rear;
			
		}else if(rear == null) {
			System.out.println("Rear is Null. So making "+ data + " as rear.");
			this.rear = newNode;
			this.front.next = rear;
			
		}else {
			System.out.println("Inserting "+ data + " after rear "+ rear.data);
			this.rear.next = newNode;
			this.rear = newNode;
		}
		
		// Displaying front and rear after insertion
		System.out.println(
			"Front: " + this.front.data + " " +
			"Rear: " + (this.rear!=null ? this.rear.data:"null") 
		);
		
	}
	
	public void delete() {
		if(front == null && rear == null) {
			System.out.println("Can not perform deletion as front and rear are null.");
			
		}else if(front!=null && rear == null) {
			System.out.println("Only front element in queue and no rear. So making front " + this.front.data + " as null.");
			this.front = null;
			
		}else {
			System.out.println("Deleting: " + this.front.data);
			this.front = this.front.next;
			// covering case where 2 elements are in queue and 
			// front takes place of rear at the time of deletion
			if(this.front == this.rear || this.length() == 1) {
				this.rear = null;
			}
		}
	}
	
	public void display() {
		System.out.print("Queue: ");
		QueueNode p = this.front;
		while (p!=null) {
			System.out.print(p.data + " ");
			p=p.next;
		}
		System.out.println();
	}
	
}

public class QueueLinkedList {

	public static void main(String[] args) {
		
		// Queue q = new Queue();
		// Queue q = new Queue(98);
		// Queue q = new Queue(76, 45);
		Queue q = new Queue(76, 45, 56, 90, 19);
		
		q.insert(10);
		q.insert(7);
		q.insert(64);
		q.insert(27);
		q.delete();
		q.insert(12);
		q.insert(83);
		q.delete();
		q.delete();
		
		q.display();

	}

}
