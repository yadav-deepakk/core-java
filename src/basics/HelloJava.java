package basics;

public class HelloJava {
	
	public static void identifiersLiterals() {
		// Identifiers
		// name given to package, class, methods and variables.
		// only alphabets and numbers are allowed.
		// can not have special chars (except _ and $ for variable name)
		// Descriptive names, no length limit
		// can not begin with a number, only alphabet/underscore(_)/Dollar($)symbol is allowed in beginning. 
		// method,variable - camelCase, class - PascalCase, constants - CONSTANT_VALUE
		int number = 1;
		int luckyNumber = 7;
		boolean isMale = true; 
		System.out.println(number + " " + luckyNumber + " " + isMale);
		
		String $name = "Deepak"; 
		System.out.println("$name: " + $name);

		float PI_VALUE = 3.14f;
		System.out.println(PI_VALUE);
		
		// Literals are values given to the variables. 
		// (1) int, (2) floating values, (3) scientific values
		int n1 = 10;
		float weight = 50.75f;
		double EARTH_RADIUS_METER = 6.371e6; 
		System.out.println("int : " + n1);
		System.out.println("floating : " + weight);
		System.out.println("scientific listeral : " + EARTH_RADIUS_METER);
		
		// (4) octal, hexadecimal, binary
		int octalValue1 = 0123; 
		int hexValue1 = 0xAD;
		int binaryValue1 = 0b0001_0000; 
		System.out.println("octalValue1: " + octalValue1);
		System.out.println("hexValue1: " + hexValue1);
		System.out.println("binaryValue1: " + binaryValue1);
		
		// (5) String (6) char, (7) boolean, (8) null
		String str1 = "Example String Literal."; // 
		char ch = 'c';
		boolean isTrue = true; 
		String str2 = null; // objects can store null values. 
		System.out.println("string literal: " + str1);
		System.out.println("character literal: " + ch);
		System.out.println("boolean literal: " + isTrue);
		System.out.println("null  literal: " + str2);
		
	}

	public static void dataTypesInJava() {
		System.out.println("Primitive:Numeric (Non-Floating point numbers) - byte, short, int, double");
		byte b1 = 10, b2 = 127, b3 = -128;
		short sh1 = -12222, sh2 = 12222;
		int num1 = 12312, num2 = -1223421;
		long l1 = 12_343_235_234_323l, l2 = 12L;
		System.out.println(b1 + " " + b2 + " " + b3 + " " + sh1 + " " + sh2);
		System.out.println(num1 + " " + num2 + " " + l1 + " " + l2);

		System.out.println("Primitive:Numeric (Floating point numbers) - float, double");
		float f1 = 123.045f, f2 = 12.464645f;
		double d1 = 10000.00123, d2 = 23425346.9756756;
		System.out.println(f1 + " " + f2 + " " + d1 + " " + d2);

		System.out.println("Primitive:Non-Numeric:- char, boolean");
		char ch = 'A';
		boolean isOn = true;
		System.out.println(ch + " " + isOn);

		System.out.println("Non-Primitive: String, array etc.");
		String str1 = "  This is a string example ";
		String str2 = "This is a string example";
		System.out.println(str1);

		// String methods in java
		System.out.println("str1 length: " + str1.length());
		System.out.println("str1 length after trim: " + str1.trim().length());
		System.out.println("str1 upper: " + str1.toUpperCase());
		System.out.println("str1 lower: " + str1.toLowerCase());
		System.out.println("converting str1 to a charArray : ");
		char chars[] = str1.toCharArray();
		for (char c : chars) {
			System.out.print(c + " ");
		}
		System.out.print("\n");
		System.out.println("comparing str2 and str1: " + str2.equals(str1));
		System.out.println("comparing str2 and trimmed str1: " + str1.trim().equalsIgnoreCase(str2));
	}

	public static void typesCastingTruncation() {
		int num1 = 7, num2 = 3;
		int quo1 = num1 / num2; // Implicit type casting (quotient will loose decimal value)
		double quo2 = num1 / num2; // Implicit type casting (quotient will loose decimal value)
		double quo3 = (double) num1 / num2; // Explicit type casting (quotient will not loose decimal value)
		double quo4 = num1 / (double) num2; // Explicit type casting (quotient will not loose decimal value)
		System.out.println(quo1);
		System.out.println(quo2);
		System.out.println(quo3);
		System.out.println(quo4);

		int n1 = 345;
		byte b1 = (byte) n1; // Explicit type casting
		System.out.println(b1);

		char c = 'a';
		int a = c; // Implicit type casting
		System.out.println(a);
	}

	public static void operators() {
		// assignment
		int n1 = 1;
		int n2 = 10;

		// Arithmetic:
		// addition(+), subtract(-), multiplication(*), division(/), modulo(%)
		int n3 = n1 + n2;
		int n4 = n1 - n2;
		int n5 = n1 * n2;
		int n6 = n1 / n2;
		int n7 = n1 / n2;
		System.out.println(n3 + " " + n4 + " " + n5 + " " + n6 + " " + n7);

		// Relational Operators: ==, !=, >=, <=, <, >
		// Logical Operators:- &&, ||, !
		if (n1 == n2)
			System.out.println(n1 + " is not equal to " + n2);
		if (n1 > 0 && n1 < n2)
			System.out.println("&& : " + n1);
		if (n1 > 0 || n1 > n2)
			System.out.println("|| : " + n1);
		if (!(n1 == n2))
			System.out.println("! : " + n1);

		// Unary: increment(++x,x++), decrement(--y,y--), !x, ~y
		int num1 = 5;
		int num2 = 7;
		int res = num1++ + ++num1 + num2--; // num1=7, num2=6
//					5    +    7   +  7    =  19
		System.out.println("num1:" + num1 + ", num2:" + num2);
		System.out.println("Result : " + res);

		// conditional/ternary operator
		// (exp1) ? exp2 : exp3;
		boolean isTrue = true;
		System.out.println(isTrue ? "Yes" : "No");

		// Bitwise operator
		// >>, <<, &, |, ^, ~
		int x1 = 5; // 0000 0101
		int x2 = 8; // 0000 1000

		int res1 = x2 & (x2 - 1); // 0000_1000 ^ 0000_0111 = 0000_0000
		System.out.println(res1 != 0 ? "x2 is not power of 2" : "x2 is power of 2");

		int res2 = x1 | x2; // 0000 1101
		int res3 = x1 ^ x2; // 0000 1101
		int res4 = ~x2;
		int res5 = x2 << 2;
		int res6 = x2 >> 2;
		System.out.println("bitwise or of 5 and 8: " + res2);
		System.out.println("bitwise xor of 5 and 8: " + res3);
		System.out.println("bitwise not of 8: " + res4);
		System.out.println("bitwise left shift of 8: " + res5);
		System.out.println("bitwise left shift of 8: " + res6);

	}

	public static void conditionalStatemnents() {
		// if, if-else, if-else ladder
		int a = 5, b = 10, c = 1;
		if (a > b) {
			if (a > c) {
				System.out.println("a is greater");
			} else {
				System.out.println("c is greater");
			}
		} else {
			if (b > c) {
				System.out.println("b is greater");
			} else {
				System.out.println("c is greater");
			}
		}

		// switch case
		char ch = 'a';
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("character " + ch + " is a vowel");
				break;
			default:
				System.out.println("character " + ch + " is a consonant");
			}

		} else {
			System.out.println("character " + ch + " is not an alphabet");
		}
	}

	public static void loops() {
		// -- for loop
		int num1 = 12;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num1 + "*" + i + "=" + (num1 * i));
		}

		// -- enhanced for loop.
		System.out.println();
		int[] nums = { 1, 4, 2, 8, 9, 12 };
		String str = "This is a String.";
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
		for (char ch : str.toCharArray()) {
			System.out.print(ch + " ");
		}
		System.out.println();

		// -- while loop
		int x = 1235;
		int revX = 0;
		System.out.print("Reverse of " + x + " is: ");
		while (x != 0) {
			revX = revX * 10 + (x % 10);
			x /= 10;
		}
		System.out.print(revX);
		System.out.println();

		// -- do while loop
		int var1 = 10;
		do {
			System.out.println("var1: " + var1);
		} while (var1 > 10);

	}

	public static void stringsInJava() {
		// strings are instance(object) of class String written in double quotes.
		// different ways of declaring strings
		String str1 = new String("This is a String Object."); // creating instance string class
		String str3 = "This is a string object."; // declaring a string in double quotes
		String str2 = "This" + " is a String Object."; // concatenating 2 or more strings
		String str4 = "  This is a String Object.  ";

		// length
		System.out.println(str1.length());
		System.out.println(str4.length());

		// converting into character array
		char[] chars = str1.toCharArray();
		for (char c : chars) {
			System.out.print(c + " ");
		}
		System.out.print("\n");

		// comparing (result is boolean)
		System.out.println(str1 == str2); // false
		System.out.println(str1.equals(str2)); // true
		System.out.println(str4.equals(str3)); // false
		System.out.println(str1.equalsIgnoreCase(str3)); // true

		// comparing (result is numeric)
		System.out.println(str1.compareTo(str2)); // 0 - both are same
		System.out.println(str1.compareToIgnoreCase(str3)); // 0 - both are same
		System.out.println(str1.compareToIgnoreCase(str4)); // positive number
		System.out.println(str4.compareToIgnoreCase(str1)); // negative number

		// changing case to upper or lower.
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());

		// trim, replace
		System.out.println(str4.replace(" ", "#"));
		System.out.println(str4.trim().replace(" ", "#"));
		System.out.println(str1.equals(str4.trim()));

		// access string content in parts
		System.out.println(str1.charAt(0));
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(1, 8)); // 8th index will not be included.
		System.out.println(str1.subSequence(1, 8));

		// accessing index
		System.out.println(str1.indexOf("i"));
		System.out.println(str1.indexOf("is"));
		System.out.println(str1.indexOf("is", 3)); // starts checking for 'is' in str1 after index 3
		System.out.println(str1.lastIndexOf("i"));
		System.out.println(str1.lastIndexOf("is"));
		System.out.println(str1.lastIndexOf("is", 4)); // starts checking backwards for 'is' in str1 from index 4

		// checking start and end of a string
		System.out.println(str4.startsWith(" "));
		System.out.println(str4.startsWith("This"));
		System.out.println(str4.startsWith("This", 2));
		System.out.println(str4.endsWith(" "));
		System.out.println(str4.endsWith("t."));

		// concatenate and split
		System.out.println(str1.concat(str2));
		String str5[] = str1.split(" ");
		int i = 0;
		for (String word : str5) {
			System.out.println((++i) + ": " + word + " ");
		}

	}

	public static void arraysInJava() {
		// 1D
		System.out.println("-- 1 Dimentional Array. ");
		char chars[] = { 'c', 'h', 'a', 'r', 'a', 'c', 't', 'e', 'r' };
		System.out.println(chars);

		int nums[] = { 2, 5, 1, 9, 3 };
		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.print("\n");

		// 2D or multi-dimensional array.
		System.out.println("-- 2 Dimentional Array. ");
		int[][] matrixA = { { 1, 7, 6 }, { 9, 4, 1 } };
		int[][] matrixB = { { 2, 4 }, { 3, 6 }, { 5, 9 } };
		int r1 = matrixA.length, c1 = matrixA[0].length, r2 = matrixB.length, c2 = matrixB[0].length;
		int[][] res = new int[r1][c2];
		if (c1 == r2) { // check multiplication condition.
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					for (int k = 0; k < c1; k++) {
						res[i][j] += matrixA[i][k] * matrixB[k][j];
					}
				}
			}
		} else {
			// col_count of 1st matrix should be equal to row_count of 2nd matrix
			System.out.println("Matrices can not be multiplied! " + c1 + " != " + r2);
		}

		for (int[] row : res) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

		// Jagged arrays. - row size is fixed but column size varies.
		System.out.println("-- Jagged Array. ");
		int[][] jagged_arr = new int[3][]; 
		jagged_arr[0] = new int[]{1, 4, 9, 7 };
		jagged_arr[1] = new int[]{12, 34, 1 };
		jagged_arr[2] = new int[]{ 1, 6, 99, 91, 65, 19 }; 
						
		for (int[] arr : jagged_arr) {
			for (int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// identifier:- name given to any class, method, variable or a package
		// literals - possible values that could be assigned to variables. 
//		identifiersLiterals(); 
		
		// Data types in java
		// (1) Primitive:-
		// (i) numeric:- byte(8bit), short(16bit), int(32bit), long(64bit),
		// float(32bit), double(64bit).
		// (ii) non numeric:- char(32bit), boolean(NA)
		// (2)Non-Primitive:- array, String etc
//		dataTypesInJava();

		// type casting and truncation
//		typesCastingTruncation();

		// operators:- AALURCB
		// assignment, arithmetic, Logical, Unary, Relational, Conditional/Ternary,
		// Bitwise
//		operators();

		// conditional statements flow:- if, if-else, if-else ladder, switch case
//		conditionalStatemnents();

		// loops in java - for, while, do-while, enhanced for loop.
//		loops();

		// Strings in Java
//		stringsInJava();

		// arrays in java
//		arraysInJava();

	}

}
