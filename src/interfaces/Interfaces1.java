package interfaces;

interface A{
	int a = 10; 
	void A(); 
}

interface B{
	int b = 20; 
	void B(); 
}

class AB implements A, B{
	@Override
	public void A() {
		System.out.println("Method A");
	}
	
	@Override
	public void B() {
		System.out.println("Method B");
	}
}


public class Interfaces1 {
	
	public static void main(String[] args) {
		System.out.println(A.a); 
		System.out.println(B.b); 

		AB ab = new AB(); 
		ab.A();
		ab.B();
	}

}
