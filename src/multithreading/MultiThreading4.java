package multithreading;

class ExampleThread implements Runnable {
	public void run() {
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println(i + 1 + ": Focus is important to master a skill.");
				Thread.sleep(1000);
			}
		} catch (Exception ex) {
			System.out.println("InterruptedException...");
		}
	}
}

public class MultiThreading4 {

	public static void main(String[] args) {

		Runnable messageThread = new ExampleThread();

		Thread t1 = new Thread(messageThread);
		t1.start();
		t1.interrupt();

	}

}
