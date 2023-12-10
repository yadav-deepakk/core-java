package oops;

class Demo1 { // extends Object
	void display1() {
		System.out.println("class Demo1 - display 1");
	}
}

class Demo2 extends Demo1 {
	void display2() {
		System.out.println("class Demo2 - display 2");
	}
}

class Demo3 extends Demo2 {
	// Demo3 will get methods display1 and display2
	// Automatically by extending Demo2
}

public class InheritanceMultiLevel {
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		d.display1();
		d.display2();
	}

}
