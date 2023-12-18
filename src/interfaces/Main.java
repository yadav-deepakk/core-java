package interfaces;

interface Computer {

	void compileCode();

	void debugCode();
}

class Laptop implements Computer {
	private String brandName;

	public Laptop(String brandName) {
		this.brandName = brandName;
	}

	public void compileCode() {
		System.out.println("Code compiled on " + this.brandName + " Laptop...");
	}

	public void debugCode() {
		System.out.println("Code debugging on " + this.brandName + " Laptop...");

	}

}

class Desktop implements Computer {
	public void compileCode() {
		System.out.println("Code runnig on Desktop...");
	}

	public void debugCode() {
		System.out.println("Code runnig on Desktop...");
	}

}

class Developer {
	public void runCode(Computer device) {
		String deviceName = device.getClass().getSimpleName();
		System.out.println("Code runnig on " + deviceName + " by " + this + " ...");
	}

}

public class Main {
	public static void main(String[] args) {
		Computer device1 = new Laptop("Lenovo Ideapad");
		Computer device2 = new Desktop();
		Developer dev1 = new Developer();
		Developer dev2 = new Developer();
		
		dev1.runCode(device2);
		dev2.runCode(device1);

		
	}
}
