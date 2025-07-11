package threadImplementation;

//Create thread using Thread Class
public class ThreadUsingThreadClass extends Thread {
	public void run() {
		for (int i = 10; i >= 1; i--) {
			System.out.println("Thread value " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
