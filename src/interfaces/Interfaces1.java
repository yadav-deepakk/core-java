package interfaces;

interface A{
	int a = 10; 
	void methodA(); 
}

interface B{
	int b = 20; 
	void methodB(); 
}

class AB implements A, B{
	@Override
	public void methodA() {
		System.out.println("Method A");
	}
	
	@Override
	public void methodB() {
		System.out.println("Method B");
	}
}


public class Interfaces1 {
	
	public static void main(String[] args) {
		System.out.println(A.a); 
		System.out.println(B.b); 

		AB ab = new AB(); 
		ab.methodA();
		ab.methodB();
	}

}
