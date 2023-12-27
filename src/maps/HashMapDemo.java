package maps;

import java.util.*;

class Student {
	private String name;
	private float age;
	private int rollno;

	public Student() {
	}

	public Student(String name, float age, int rollno) {
		this.name = name;
		this.age = age;
		this.rollno = rollno;
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

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student[name=" + this.name + ", age=" + this.age + ", rollno=" + this.rollno + "]";
	}

}

public class HashMapDemo {

	public static void hashMapMethod1() {
		Map<Character, Integer> map = new HashMap<Character, Integer>(10);

		map.put('a', 10);
		map.put('b', 20);
		map.put('c', 30);

		System.out.println("Size of the map: " + map.size());
		System.out.println(map);

		System.out.println(map.containsKey('a') ? map.get('a') : "Key is not presen in map!!!");

		System.out.println("\nAccessing elements using keyset");
		for (char key : map.keySet())
			System.out.println("Key=" + key + ", " + "Value=" + map.get(key));

		System.out.println("\nAccessing elements using EntrySet");
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println("Key=" + entry.getKey() + ", " + "Value=" + entry.getValue());
		}
	}

	public static void hashMapMethod2() {
		Map studentData = new HashMap();
		Student st1 = new Student("Deepak", 25, 1);
		Student st2 = new Student("Neel", 24, 2);
		Student st3 = new Student("Ritesh", 29, 3);
		Student st4 = new Student("Gaurav", 20, 4);

		studentData.put(1, st1);
		studentData.put(2, st2);
		studentData.put(3, st3);
		studentData.put(4, st4);

		Set entrySet = studentData.entrySet();
		Iterator itr = entrySet.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	public static void main(String[] args) {
		// hashMapMethod1();
		hashMapMethod2();
	}

}
