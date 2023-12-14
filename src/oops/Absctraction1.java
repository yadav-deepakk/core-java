package oops;


// 100% Abstraction - All methods of abstract class are abstract methods. 
abstract class Animal {

	public abstract void run();

	public abstract void sleep();
}

class Lion extends Animal {
	public void run() {
		System.out.println("Lions can run");
	}

	public void sleep() {
		System.out.println("Lions can sleep");
	}

	// specialized method.
	public void hunt() {
		System.out.println("Lions can hunt.");
	}
}

class Fox extends Animal {
	public void run() {
		System.out.println("Fox can run");
	}

	public void sleep() {
		System.out.println("Fox can sleep");
	}
}

public class Absctraction1 {

	public static void main(String[] args) {
		Animal animal1 = new Lion();
		Animal animal2 = new Fox();

		animal1.run();
		animal2.sleep();
		
		// Parent ref can not see specialized methods/variables. 
		((Lion) animal1).hunt();

		animal2.run();
		animal2.sleep();

	}

}
