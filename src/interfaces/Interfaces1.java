package interfaces;


// interfaces are much similar to abstract class but they are not class and can not be instantiated.
/* 1. interfaces are implemented, abstract classes are extended 
 * 2. they can not be instantiated and can not have a constructor. 
 * 3. variables declared are public static final, hence always assigned a value. 
 * 4. methods are public and abstract(even if they aren't declared with abstract keyword.)
 * */

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
		System.out.println(ab.a);
	}

}
