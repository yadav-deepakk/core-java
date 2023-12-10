package methods;

public class Addition {

	public int add(byte a, byte b) {
		System.out.println("byte byte");
		return a + b;
	}

	public int add(short a, short b) {
		System.out.println("short short");
		return a + b;
	}

	public long add(long a, long b) {
		System.out.println("long long");
		return a + b;
	}

	public int add(int a, int b) {
		System.out.println("int int");
		return a + b;
	}

	public float add(float a, float b) {
		System.out.println("float float");
		return a + b;
	}
	
	public int add(char ch1, char ch2) {
		System.out.println("char char");
		return ch1 + ch2; 
	}

	public double add(double a, double b) {
		System.out.println("double double");
		return a + b;
	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		System.out.println(addition.add(1,1));

	}

}
