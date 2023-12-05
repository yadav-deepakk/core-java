package strings;

public class MutableString {
	// Append operation to modify current object
	public static void mutableStringAppend() {
		StringBuffer sb = new StringBuffer();
		sb.append("Virat");
		sb.append(" ");
		sb.append("Kohli");
		System.out.println(sb);

		// Object can be assigned a new instance of StringBuffer later on
		sb = new StringBuffer("Sachin");
		sb.append("Tendulkar");
		System.out.println(sb);

	}

	// final StringBuffer
	public static void mutableStringFinal() {
		// final object can not be assigned a new instance of StringBuffer/StringBuilder at later stage. 
		final StringBuffer sb = new StringBuffer();
		sb.append("Mahiendra Sigh Dhoni");
		sb.append(" ");
		sb.append("MSD");
		System.out.println(sb);
		
		// below code will give compile time error as sb is a final object.
		// sb = new StringBuffer("Sachin");
	}

	// capacity and length
	public static void mutableStringCapacity() {
		// initial capacity = "no of chars in initialization"+ 16
		// length = current length(number of characters) of string. 
		StringBuffer sb1 = new StringBuffer(); // capacity=16, length=0
		System.out.println("capacity: " + sb1.capacity() + ", length: " + sb1.length());
		
		StringBuffer sb2 = new StringBuffer("Virat"); // capacity=(5)+16=21, length=5
		System.out.println("capacity: " + sb2.capacity() + ", length: " + sb2.length());
		
		// as soon as capacity is full and more characters are being added.
		// new_capacity = (old_capacity + no of newly added chars) * 2; 
		StringBuffer sb3 = new StringBuffer(); // capacity=16, length=0
		sb3.append("english alphabet");
		System.out.println(sb3);
		System.out.println("capacity before adding \"s\": " + sb3.capacity());
		sb3.append("s english alphabets"); 
		System.out.println(sb3);
		System.out.println("capacity after adding \"s\": " + sb3.capacity());

	}

	public static void main(String[] args) {
//		mutableStringAppend(); 
//		mutableStringFinal(); 
		mutableStringCapacity();

	}

}
