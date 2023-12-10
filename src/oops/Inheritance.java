package oops;

// Single level inheritance - one super class is extended by one or more child/derived classes. 
class Human { // parent class //super class //base class
	private String name;
	private String gender;
	float age;

	public Human() {
		System.out.println("Human class CONTRUCTOR");
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public void sleep() {
		System.out.print("Human needs 8hrs of sleep on an average day.");
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

}

class Student extends Human { // child class //sub class //derived class

	// private variables cannot be inherited in inheritance.
	public void displayName() {
		System.out.println("name: " + this.getName());
	}

	public void displayAge() {
		System.out.println("name: " + this.age);

	}

}

class Person extends Human {
	
}

public class Inheritance {

	public static void main(String[] args) {

//		String studentName = "Deepak Kumar";
//		float studentAge = 25.01f;

		Student st1 = new Student();
		Person p1 = new Person(); 
		p1.setName("Deep");
		
		System.out.println(p1.getName());
		System.out.println(st1.getName());
	}

}
