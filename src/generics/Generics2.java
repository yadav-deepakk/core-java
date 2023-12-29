package generics;

class GenericClass<T> {
	T obj;

	public GenericClass() {
	}

	public GenericClass(T obj) {
		this.obj = obj;
	}

	public void printGenericClassName() {
		try {
			System.out.println("Generic class: " + this.obj.getClass().getSimpleName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Generics2 {
	public static void main(String[] args) {
		System.out.println("Main Method Start ...");
		System.out.println();

		GenericClass object1 = new GenericClass(10);
		object1.printGenericClassName();

		GenericClass object2 = new GenericClass("ABC");
		object2.printGenericClassName();

		GenericClass<Float> object3 = new GenericClass<Float>(100.01f);
		object3.printGenericClassName();

		System.out.println();
		System.out.println("Main Method Ends ...");

	}
}
