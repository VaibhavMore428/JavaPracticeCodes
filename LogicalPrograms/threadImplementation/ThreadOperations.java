package threadImplementation;

public class ThreadOperations {
	public static void main(String[] args) {
		System.out.println("Program started");
		int x = 10 + 20;
		System.out.println("sum is " + x);

		// Thread Opertaions
		Thread t = Thread.currentThread();
		String threadName = t.getName();
		System.out.println("Thread name= " + threadName);
		t.setName("MainThread");
		System.out.println(t.getName());
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(t.threadId());
		System.out.println("Program ended");
	}
}
