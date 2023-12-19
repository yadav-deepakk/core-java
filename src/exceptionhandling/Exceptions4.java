package exceptionhandling;

import java.util.Scanner;

@SuppressWarnings("serial")
class NegetiveNumberException extends Exception {
	public NegetiveNumberException() {
	}

	public NegetiveNumberException(String msg) {
		super(msg);
	}
}

public class Exceptions4 {

	public static long factorial(int num) {
		long f = num;
		while (--num > 0)
			f *= num;
		return f;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number to calculate factorial: ");
			int n = sc.nextInt();
			if (n < 0) {
				throw new NegetiveNumberException("factorial can not be calculated, enter positive integer.");
			} else {
				System.out.println("factirial of " + n + ": " + factorial(n));
			}

		} catch (Exception e) {
			System.out.println("Exception occured, " + e);
		}
	}
}
