package multithreading;

public class MultiThreading3 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main thread started....");

		// join() and isAlive() method
		Runnable messageThread = new Runnable() {
			public void run() {
				try {
					for (int i = 0; i < 3; i++) {
						System.out.println(i + 1 + ": Focus is important to master a skill.");
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(messageThread);
		System.out.println("isAlive: " + t1.isAlive()); // false
		t1.start();
		System.out.println("isAlive: " + t1.isAlive()); // true
		t1.join();
		System.out.println("isAlive: " + t1.isAlive()); // true

		System.out.println("Main thread ended....");

	}

}
