package oops;

// final classes can not be used in inheritance
final class Vegetable {

}

class Fruit {
	String color; 
	// final variable values can not be changed in later stage
	final float mrpPrice = 1000.00f; 
	
	// final methods can not be overridden. 
	final public  void eat () {
		System.out.println("Purchase at : " + this.mrpPrice + " INR");
		System.out.println("Ripe fruits can be eaten.");
	}
}

class Mango extends Fruit{
}



public class FinalKeyword {

	public static void main(String[] args) {
		Fruit mango = new Mango(); 
		mango.eat();
	}

}
