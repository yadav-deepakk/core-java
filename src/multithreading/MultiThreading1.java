package multithreading;

class MyThread1 extends Thread {
	// prints even numbers.
	public void run() {
		for (int i = 0; i <= 10; i += 2) {
			System.out.println(Thread.currentThread().getName() + ": " + i + " ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 extends Thread {
	// prints odd numbers.
	public void run() {
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreading1 {
	public static void main(String args[]) {
		System.out.println(Thread.currentThread().getName());
		MyThread1 t1 = new MyThread1();
		t1.start();
		
		System.out.println();
		
		MyThread2 t2 = new MyThread2();
		t2.start();
	}

}
