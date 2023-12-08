package constructor;

class Person { // extends Object
	String name;
	float age;

	// Default Constructor
	public Person() {
		super();
	}

	// Parameterized Constructor
	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}

	// constructor overloading
	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public void displayPersonDetails() {
		System.out.println("Person [name=" + name + ", age=" + age + "]");
	}
}

public class ConstructorPractice1 {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Deep");
		Person p3 = new Person("Deepak", 25.0f);

		p1.displayPersonDetails();
		p2.displayPersonDetails();
		p3.displayPersonDetails();
	}

}
