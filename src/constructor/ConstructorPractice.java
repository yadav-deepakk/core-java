package constructor;

class Student {
	private String name;
	private float age;

	Student() {}

	Student(String name, float age) {
		this.name = name;
		this.age = age;
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

	public void displayStudentData() {
		System.out.println("Name : " + this.name + ", Age: " + this.age);
	}
}

public class ConstructorPractice {

	public static void main(String[] args) {
		Student s1 = new Student("Deepak", 25.0f); 
		
		s1.displayStudentData();

	}

}
