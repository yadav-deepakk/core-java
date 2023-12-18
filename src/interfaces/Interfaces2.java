package interfaces;

interface Car{
	void start(); 
}

public class Interfaces2 {

	public static void main(String[] args) {
		// anonymous class
		Car c1 = new Car() {
			private final String carBrand = "WagonR"; 
			public void start() {
				System.out.println(this.carBrand + ", Car is starting...");
			}
		}; 
		c1.start();
		
		// lambda expression can be done with functional interfaces.
		Car c2 = () -> System.out.println("Car is starting...");	
		c2.start();
	}
}
