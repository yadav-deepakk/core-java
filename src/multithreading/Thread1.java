package multithreading;

public class Thread1 {

	public static void main(String[] args) {
		// Before changing thread priority,
		System.out.println("Before changing thread priority.");
		Thread mainThread = Thread.currentThread();
		System.out.println("Main thread name : " + mainThread.getName());
		System.out.println("Main thread priority : " + mainThread.getPriority());

		mainThread.setName("MAIN THREAD");
		mainThread.setPriority(1);

		// After changing thread priority
		System.out.println("After changing thread priority.");
		System.out.println("Main thread name : " + mainThread.getName());
		System.out.println("Main thread priority : " + mainThread.getPriority());
	}
}
