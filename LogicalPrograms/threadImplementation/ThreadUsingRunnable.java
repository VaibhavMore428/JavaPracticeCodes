package threadImplementation;

//Create thread using runnable interface
public class ThreadUsingRunnable implements Runnable {
	public void run() {
		// Task for thread.

		for (int i = 0; i < 10; i++) {
			System.out.println("Value of i is " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadUsingRunnable t1 = new ThreadUsingRunnable();
		Thread thread = new Thread(t1);
		ThreadUsingThreadClass t2 = new ThreadUsingThreadClass();
		thread.start();
		t2.start();
	}
}
