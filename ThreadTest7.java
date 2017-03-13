// 스레드 동기화

class CounterThread extends Thread {
	private int count = 1;

	public CounterThread(String threadName) {
		super(threadName);
	}

	public void run() {
		
		while (!isInterrupted()) {
			System.out.printf("%s: %d번째 방문.\n", getName(), count);
			count++;
			try {
				sleep(100);	// 1000 ms = 1s
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
		}
	}
}

class CounterRunnable implements Runnable {
	private int count = 1;

	public void run() {
		while (true) {
			synchronized (this) {
				System.out.printf("%s: %d번째 방문.\n", Thread.currentThread().getName(), count);
				count++;
			}
			try {
				Thread.sleep(100);	// 1000 ms = 1s
				//Thread.currentThread().wait(100);
			} catch (Exception e) {
				e.printStackTrace();
				return;
			} 		
		}
	}
}


public class ThreadTest7{
	public static void main(String[] args) {
		// 1. NEW
		CounterThread thread1 = new CounterThread("Counter-1 thread");
		CounterThread thread2 = new CounterThread("Counter-2 thread");

		CounterRunnable cr = new CounterRunnable();
		Thread thread3 = new Thread(cr, "Counter3");
		Thread thread4 = new Thread(cr, "Counter4");

		// 2. RUNNING
		thread1.start();
		thread2.start();

		thread3.start();
		thread4.start();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		thread1.interrupt();
		thread2.interrupt();

		thread3.interrupt();
		thread4.interrupt();
	}
}