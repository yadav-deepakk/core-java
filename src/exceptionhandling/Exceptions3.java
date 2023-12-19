package exceptionhandling;

public class Exceptions3 {

	public void arithOperation() throws Exception {
		int a = 10;
		int b = 0;
		int result = 0;

		try {
			result = a / b;

		} catch (Exception e) {
			System.out.println("Exception Occured...");
			throw new Exception(e);

		} finally {
			System.out.println("finally block...");

		}

		System.out.println("Result : " + result);
	}

	public void operation() {
		try {
			this.arithOperation();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			System.out.println("finally block executed...");

		}
	}

	public static void main(String[] args) {
		Exceptions3 ex = new Exceptions3();
		ex.operation();
	}

}
