package exceptionhandling;

import java.util.*;

public class Exceptions1 {

	public static void main(String[] args) {

		System.out.println("Program Started...");
		Scanner sc = new Scanner(System.in);
		int a = 10;
		int b = 1;
		int[] arr = { 1, 2, 5, 9 };

		int result = 0;

		try {
			System.out.println("Enter a integer value : ");
			int num = sc.nextInt(); // this can introduce inputMisMatchError
			result = a * b + num / 10;
			result = a / b; // introduces arithmetic / by zero
			result = arr[-1] / b; // introduces ArrayIndexOutOfBoundsException

		} catch (ArithmeticException arithEx) {
			System.out.println("Arithmetic Exception Occured.");
			System.out.println("Reason: " + arithEx);

		} catch (ArrayIndexOutOfBoundsException arrIndexEx) {
			System.out.println("ArrayIndexOutOfBounds Exception Occured.");
			System.out.println("Reason: " + arrIndexEx);

		} catch (InputMismatchException inputMismatchEx) {
			System.out.println("InputMismatch Exception Occured.");
			System.out.println("Reason: " + inputMismatchEx);

		} catch (Exception ex) {
			System.out.println("Something went wrong..");
			System.out.println("Reason: " + ex);

		} finally {
			// statements execution is compulsory in programming, like resource closing.
			sc.close();
		}

		System.out.println("Result after try-catch-finally block : " + result);
		System.out.println("Program Ends...");
	}

}
