package constructor;

class Demo1 extends Object {
	int a, b;

	public Demo1() {
		System.out.println("Parent : Demo1 default constructor");
	}

	public Demo1(int a, int b) {
		System.out.println("Parent : Demo1 prameterized constructor");
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Demo1 [a=" + a + ", b=" + b + "]";
	}

}

class Demo extends Demo1 {
	int m, n;

	Demo() {
		// if this() call is given then super() is not included. 
		this(10, 20); 
		System.out.println("Child : Demo default constructor");
	}

	Demo(int m, int n) {
		super(m,n);
		System.out.println("Child : Demo paramerterized constructor");
	}

	@Override
	public String toString() {
		return "Demo [m=" + m + ", n=" + n + "]";
	}

}

public class ConstructorExecInheritance {

	public static void main(String[] args) {
		// child constructor is called where super() will call parents constructor.
		// Demo d1 = new Demo();
		Demo d2 = new Demo(12, 6);

		System.out.println(d2.a);
		System.out.println(d2.b);
		System.out.println(d2.m);
		System.out.println(d2.n);

	}

}
