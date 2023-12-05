package datastructures;


class Node{
	int data;
	Node nextNode;
	
	Node(int data){
		this.data = data;
		this.nextNode = null;
	}
	
	Node(int data, Node nextNode){
		this.data = data;
		this.nextNode = nextNode;
	}
}

class LinkedList{
	Node head;
	
	LinkedList(){
		this.head = null;
	}
	
	LinkedList(int data){
		Node newNode = new Node(data);
		this.head = newNode;
	}
	
	public int length() {
		Node p = this.head;
		int n = 0;
		while (p!=null) {
			n++;
			p = p.nextNode;
		}
		return n;
	}
	
	public void addNodeStart(int data) {
		Node newNode = new Node(data);
		newNode.nextNode = this.head;
		this.head = newNode;
		System.out.println("Data {" + data + "} inserted at start.");
	}
	
	public void addNodeEnd(int data) {
		if(this.head == null) {
			this.addNodeStart(data);
		}else {
			Node newNode = new Node(data);
			Node p = this.head;
			while(p.nextNode!=null) {
				p = p.nextNode;
			}
			p.nextNode = newNode;
			System.out.println("Data {" + data + "} inserted at End");
		}
	}
	
	public void insertAt(int index, int data) {
		int listLength = this.length(); 
		if( !(index>0 && index<listLength+1) ) {
			System.out.println("Data {" + data + "} can not be inserted at {" + index + "}");
			return;
		}
		
		if(index == 1) {
			this.addNodeStart(data);
			return;
		}
		
		Node newNode= new Node(data);
		Node p = this.head;
		while(index>1 && p!=null) {
			p = p.nextNode;
			index--;
		}
		newNode.nextNode = p.nextNode;
		p.nextNode = newNode;
		System.out.println("Data {" + data + "} inserted at {" + index + "}");
		
	}
	
	public void displayList() {
		if (this.head == null) {
			System.out.println("List is empty!");
			return;
		}
		
		Node p = this.head;
		System.out.print("List Elements are: ");
		while (p!= null) {
			System.out.print(p.data + " ");
			p = p.nextNode;
		}
		System.out.println();
		
	}
	
}


public class LinkedListPractice{
	public static void main(String args[]) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList(7);
		
		list1.addNodeEnd(10);
		list1.addNodeEnd(1);
		list1.addNodeStart(78);
		list1.insertAt(0, 56);
		list1.insertAt(1, 29);

		list1.displayList();
		System.out.println("Length of list 1 is: " + list1.length());
		
		list2.displayList();
		
	}
}