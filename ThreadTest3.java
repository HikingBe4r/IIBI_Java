class StopThread extends Thread {
	StopThread() {
		super("stop-thread");
	}

	public void run() {
		while(!isInterrupted()) {
			System.out.printf("ThreadName: %s, Hi~\n", getName());

			try {
				sleep(100);
			} catch (Exception e) {
				
				//this.interrupt();
				e.printStackTrace();
				return;
			}
		}
		//System.out.printf("%s is dead\n", getName());
	}

}


public class ThreadTest3{
	public static void main(String[] args) {
		System.out.printf("%s is running\n", Thread.currentThread().getName());

		// 1.NEW
		StopThread thread = new StopThread();

		// 2. RUNNABLE
		thread.start();

		try {
			Thread.sleep(3000);	// 10√ 
		} catch (Exception e) {
			e.printStackTrace();
		}

		thread.interrupt();

		System.out.printf("%s is running\n", Thread.currentThread().getName());
	}
}