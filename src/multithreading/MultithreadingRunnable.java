package multithreading;

import java.util.Scanner;

class CalculationThread implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": " + "=========== Calculation ===========");
		Scanner sc = new Scanner(System.in);
		System.out.println(Thread.currentThread().getName() + ": "+ "Enter number1 : ");
		int num1 = sc.nextInt();
		System.out.println(Thread.currentThread().getName()  + ": " + "Enter number2 : ");
		int num2 = sc.nextInt();
		int result = num1 + num2;
		System.out.println(Thread.currentThread().getName() + ": " + result);
		sc.close();
		System.out.println(Thread.currentThread().getName()+ ": " + "=========== Calculation ends ===========");
	}
}

class DisplayThread implements Runnable {
	public void run() {
		
		try {
			System.out.println(Thread.currentThread().getName()+ ": " + "=========== Displaying Messages ===========");
			for (int i = 0; i < 3; i++) {
				System.out.println(Thread.currentThread().getName()+ ": " + "Focus is really important to study any new skill.");
				Thread.sleep(10);
			}
			System.out.println(Thread.currentThread().getName()+ ": " + "======== Displaying Message Ends ==========");
		} catch (Exception ex) {
			System.out.println(Thread.currentThread().getName()+ ": " + "!! Some Exception Occured !!");
		}
	
	}
}

public class MultithreadingRunnable {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());

		CalculationThread c1 = new CalculationThread();
		DisplayThread dm1 = new DisplayThread();

		Thread c1t1 = new Thread(c1);
		Thread dm1t2 = new Thread(dm1);

		c1t1.start();
		dm1t2.start();

	}

}
