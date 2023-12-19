package exceptionhandling;

import java.util.Scanner;

// try without catch block and with finally block
// try with resource

public class Exceptions2 {

	public static void main(String[] args) {
		int num, pow;
		double result;

		// try with resource block
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number and its power : ");
			num = sc.nextInt();
			pow = sc.nextInt();
			result = Math.pow(num, pow);

		} finally {
			// resources will be closed before leaving try block.
			System.out.println("Finally block");

		}

		System.out.println(result);
	}

}
