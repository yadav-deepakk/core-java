package methods;

class Aeroplane{
	public void takeOff() {
		System.out.println("Take Off ...");
	}
	public void fly() {
		System.out.println("Fly ...");
	}
	
	public void land() {
		System.out.println("landing ...");
	}
}

class CargoPlane extends Aeroplane{
	// overridden method rules 
	// 1) child method not down-grade(public > protected > default > private) its visibility, 
	// it is allowed to upgrade
	// 2) you can not change its return type
	// 3) you have to keep number of parameters similar to parent, 
	// otherwise new method will be treaded as a specialized method.
	public void fly() {
		System.out.println("Cargo Planes fly at a lower height.");
	}
}


public class MethodOverridingRules {

	public static void main(String[] args) {
		CargoPlane c1 = new CargoPlane(); 
		c1.fly();
	}

}
