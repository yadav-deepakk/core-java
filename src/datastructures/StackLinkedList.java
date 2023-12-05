package datastructures;

class StackNode{
	int data;
	StackNode next;
	
	StackNode(int data){
		this.data = data;
		this.next = null;
	}
}


class Stack{
	
	private StackNode top;
	
	Stack(){ 
		this.top = null;
	}
	
	Stack(int data){
		this.top.data = data;
		this.top.next = null;
	}
	
	Stack(int... elements){
		this();
		for (int e : elements) {
			this.push(e);
		}
	}
	
	long length() {
		long n = 0;
		StackNode p = this.top;
		while(p!=null) {
			p = p.next;
			n++;
		}
		return n;
	}
	
	boolean push(int data) {
		try {
			StackNode newNode = new StackNode(data);
			if(this.top!=null) {
				newNode.next = this.top;
			}
			this.top = newNode;
		}catch(Exception e){
			System.out.println("Error occured" + "\n" + e.getStackTrace());
			return false;
		}
		System.out.println("Element {" + data + "} pushed");
		return true;
	}
	
	boolean pop() {
		int data = 0;
		try{
			if(this.top!=null){
				data = this.top.data;
				this.top = this.top.next;
			}else {
				System.out.println("Stack Underflow!");
			}
		}catch(Exception e) {
			System.out.println("Error occoured" + "\n" + e.getStackTrace());
			return false;
		}
		System.out.println("Element {" + data + "} popped.");
		return true;
	}
	
	void display() {
		System.out.print("Stack: ");
		if(this.top == null) return;
		StackNode p = this.top;
		while( p!=null ) {
			System.out.print(p.data + " ");
			p=p.next;
		}
		System.out.println();
	}	
}

public class StackLinkedList {
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.pop();
		s.push(10);
		s.push(11);
		s.push(1);
		s.pop();
		s.push(3);
		s.push(9);
		s.pop();

		s.display();
		
	}
}
