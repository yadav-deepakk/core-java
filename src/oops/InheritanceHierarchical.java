package oops;

// in hierarchical parent/super/base class can have multiple child/subclass/derived
class Aminal {
	void run() {
		System.out.println(this + ", Running... ");
	}
	
	void sleep() {
		System.out.println(this + ", Sleeping... ");
	}
}

class Monkey extends Aminal {
	void climb() {
		System.out.println(this + ", Monkeys can jump...");
	}
}

class Tiger extends Aminal {
}

class Deer extends Aminal {
}

public class InheritanceHierarchical {

	public static void main(String[] args) {

		Monkey m1 = new Monkey();
		Tiger t1 = new Tiger();
		Deer d1 = new Deer();

		// monkey instance will get all methods from animal
		// plus its own method climb
		m1.run();
		m1.sleep();
		m1.climb();

		// tiger instance will get methods from animal
		t1.run();
		t1.sleep();

		// deer instance will get methods from animal
		d1.run();
		d1.sleep();
	}

}
