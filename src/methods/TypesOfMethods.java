package methods;

class Animal { // extends Object
	// overridden method
	public void run() {
		System.out.println("Animals can run.");
	}

	// inheritance method 
	public void sleep() {
		System.out.println("Animals can sleep.");
	}
}

class Deer extends Animal {
	// Overrider method
	@Override
	public void run() {
		System.out.println("Deers can run faster");
	}
	
	// Specialized method 
	public void jump() {
		System.out.println("Deers can jump");
	}
}

public class TypesOfMethods {

	public static void main(String[] args) {
		Deer d = new Deer(); 

		d.sleep(); 	// inherited method
		d.run();  	// overridden method
		d.jump(); 	// specialized method
	}

}
