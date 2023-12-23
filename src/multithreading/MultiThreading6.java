package multithreading;

class Library implements Runnable {

	String dsaBook = new String("DSA");
	String dbmsBook = new String("DBMS");
	String osBook = new String("OperatingSystem");
	String netwoksBook = new String("ComputerNetworks");
	
	public void run() {
		try {
			String threadName = Thread.currentThread().getName();
			switch (threadName) {
			case "STUDENT-1":
				this.acquireBooksForStudent1();
				break;

			case "STUDENT-2":
				this.acquireBooksForStudent2();
				break;
			default:
				System.out.println("No Such student...");
				break;
			}
		} catch (Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
	}

	public void acquireBooksForStudent1() throws Exception {
		synchronized (this.dsaBook) {
			Thread.sleep(3000);
			System.out.println("Student-1: took \'DSA\' Book.");
			Thread.sleep(3000);
			synchronized (this.dbmsBook) {
				System.out.println("Student-1: took \'DBMS\' Book.");
				Thread.sleep(3000);
				synchronized (this.osBook) {
					System.out.println("Student-1: took \'Operating System\' Book.");
					Thread.sleep(3000);
					synchronized (this.netwoksBook) {
						System.out.println("Student-1: took \'Computer Networks\' Book.");
						Thread.sleep(3000);
					}
				}
			}
		}
	}

	public void acquireBooksForStudent2() throws Exception {
		Thread.sleep(3000);
		synchronized (this.netwoksBook) {
			System.out.println("Student-2: took \'Computer Networks\' Book.");
			Thread.sleep(3000);
			synchronized (this.osBook) {
				System.out.println("Student-2: took \'Operating System\' Book.");
				Thread.sleep(3000);
				synchronized (this.dbmsBook) {
					System.out.println("Student-2: took \'DBMS\' Book.");
					Thread.sleep(3000);
					synchronized (this.dsaBook) {
						System.out.println("Student-2: took \'DSA\' Book.");
						Thread.sleep(3000);
					}
				}
			}
		}
	}
}

public class MultiThreading6 {

	public static void main(String[] args) {

		Library lib = new Library();
		Thread student1 = new Thread(lib);
		Thread student2 = new Thread(lib);

		student1.setName("STUDENT-1");
		student2.setName("STUDENT-2");

		student1.start();
		student2.start();
		
	}

}
