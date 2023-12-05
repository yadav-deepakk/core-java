package datatypes;

public class DataTypes {
	public static void main(String args[]){
		/* -------------------------
		 *  Primitive data types 
		 *  ------------------------ */
		
		// Numbers
		byte b1 = 12;				// 1 byte ->   -128 to 127
		short sh1 = 234; 			// 2 bytes ->  -32,278 to 32,277
		int num1 = 2344;			// 4 bytes ->  
		long l1 = 324238l;			// 8 bytes ->  
		
		float f1 = 121.34f; 		// 4 bytes ->  
		double d1 = 2341.1214d;		// 8 bytes ->  
		
		// Character
		char c1 = 'A';
		
		// Boolean
		boolean bool1 = true; 		// NA
		
		System.out.println("Non Floating Numbers are -> " + "byte: " + b1 + ", short: "+ sh1 + ", int: " + num1 + ", long: " + l1);
		System.out.println("Floating Numbers are -> " + "float: " + f1 + ", double: "+ d1);
		System.out.println("char: " + c1 + ", Boolean: "+ bool1);
		
		
		/* ----------------------------
		 *  Non - Primitive data type
		 * ---------------------------- */
		String s1 = "String"; 
		String s2 = new String("This is a sample String");
		System.out.println(s1);
		System.out.println(s2);
		
	} 
}
