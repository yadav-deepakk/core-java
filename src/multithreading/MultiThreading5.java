package multithreading;

class CarThread implements Runnable {

	/*
	 * synchronized public void run() { -> // this will make entire function
	 * synchronized.
	 * 
	 */

	public void run() {
		try {
			// this statement can be executed by multiple thread at a time.
			System.out.println(Thread.currentThread().getName() + ": " + "Entered into parking lot.");
			Thread.sleep(1000);

			// synchronized keyword allows to run only one thread at a time.
			synchronized (this) {
				System.out.println(Thread.currentThread().getName() + ": " + "Seated and started the car.");
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + ": " + "Drived to desired place.");
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + ": " + "returned, parked and left the car. ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class MultiThreading5 {

	public static void main(String[] args) {

		CarThread car1 = new CarThread();
		Thread driver1 = new Thread(car1);
		Thread driver2 = new Thread(car1);
		Thread driver3 = new Thread(car1);

		driver1.setName("Driver-1");
		driver2.setName("Driver-2");
		driver3.setName("Driver-3");

		driver1.start();
		driver2.start();
		driver3.start();

	}

}
