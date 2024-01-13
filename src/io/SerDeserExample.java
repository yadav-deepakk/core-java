package io;

import java.io.*;

class Student implements Serializable {
	private int rollNo;
	private String name;
	transient private float age;

	public Student() {
	}

	public Student(int rollNo, float age, String name) {
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
}

public class SerDeserExample {

	public static void main(String[] args) {

//		Student serializeObject = new Student(11, 19.05f, "Anoop Singh");
//		System.out.println("--------- Before Deserialisation -----------");
//		System.out.println(serializeObject.toString());
//		System.out.println(serializeObject.getAge());

		String dir = "IO_OPERATIONS";
		String fileName = "objectTransientFile.txt";
		File file = new File(dir, fileName);

//		// Serializing object and storing into the file.
//		try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
//
//			oos.writeObject(serializeObject);
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// Reading from file and De-serializing object.
		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis);) {

			Student deserialiseObject = (Student) ois.readObject();
			System.out.println("--------- After Deserialisation -----------");
			System.out.println(deserialiseObject.toString());
			System.out.println("Age : " + deserialiseObject.getAge()); 

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
