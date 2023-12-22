package multithreading;

import java.util.Scanner;

class ThreadingExample implements Runnable {

	public void run() {
		try {
			String threadName = Thread.currentThread().getName();
			switch (threadName) {
			case "CALCULATE":
				this.calculation();
				break;
			case "MESSAGE":
				this.displayImpMessage();
				break;
			default:
				break;
			}
		} catch (Exception ex) {
			System.out.println(Thread.currentThread().getName() + " : " + "Catch Block.");
			ex.printStackTrace();
		} finally {
			System.out.println(Thread.currentThread().getName() + " : " + "Finally Block.");
		}
	}

	public void displayImpMessage() {
		try {

			for (int i = 0; i < 3; i++) {
				System.out.println(
						Thread.currentThread().getName() + ": " + (i + 1) + " - Focus is required to master a skill.");
				Thread.sleep(10);
			}

		} catch (Exception ex) {
			System.out.println(Thread.currentThread().getName() + ": " + "Some error occured.");
			ex.printStackTrace();
		} finally {
			System.out.println(Thread.currentThread().getName() + ": " + "Finally Block.");
		}
	}

	public void calculation() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println(Thread.currentThread().getName() + " : " + "Enter the number1 : ");
			int number = sc.nextInt();
			int power = sc.nextInt();
			double res = Math.pow(number, power);
			System.out.println(Thread.currentThread().getName() + " : " + number + " power " + power + " is " + res);
			sc.close();
		} catch (Exception ex) {
			System.out.print(Thread.currentThread().getName() + ": ");
			System.out.println(Thread.currentThread().getName() + ": " + "Some error occured.");
			ex.printStackTrace();
		} finally {
			System.out.println(Thread.currentThread().getName() + ": " + "Finally Block.");
		}
	}
}

public class MultiThreading2 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " " + "started...");

		ThreadingExample thread = new ThreadingExample();

		Thread t1 = new Thread(thread);
		Thread t2 = new Thread(thread);

		t1.setName("CALCULATE");
		t2.setName("MESSAGE");

		t1.start();
		t2.start();
	}

}
