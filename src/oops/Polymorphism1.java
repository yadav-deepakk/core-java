package oops;

// Polymorphism: (Poly => Many + Merons => forms) -> One thing present in many forms. 
// Static/CompileTime/EarlyBinding - method overloading. -> already covered in methods. 
// Dynamic/RunTime/LateBinding - method overriding.

class AeroPlane {

	public void takeOff() {
		System.out.println("Plane is taking off.");
	}

	public void fly() {
		System.out.println("Plane is Flying.");

	}
}

class CargoPlane extends AeroPlane {
	public void takeOff() {
		System.out.println("CargoPlane is taking off.");
	}

	public void fly() {
		System.out.println("CargoPlane Fly at lower height.");

	}
}

class PassengerPlane extends AeroPlane {
	public void takeOff() {
		System.out.println("PassengerPlane is taking off.");
	}

	public void fly() {
		System.out.println("PassengerPlane Fly at medium height.");

	}
}

class FighterPlane extends AeroPlane{
	public void takeOff() {
		System.out.println("FighterPlane requires smaller runway for taking off.");
	}

	public void fly() {
		System.out.println("Plane Fly at Higher hight.");
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {
		
		AeroPlane c1 = new CargoPlane(); 
		AeroPlane p1 = new PassengerPlane(); 
		AeroPlane f1 = new FighterPlane(); 
		
		c1.takeOff();
		c1.fly();
		
		p1.takeOff();
		p1.fly();
		
		f1.takeOff();
		p1.fly();
		
		AeroPlane ref;
		ref = c1;
		ref.takeOff();
		ref.fly();
		
		ref = p1;
		ref.takeOff();
		ref.fly();
		
		ref = f1;
		ref.takeOff();
		ref.fly();
		
	}

}
