// ���󽺷��� ����
class SaveRunnable implements Runnable {
	public void run() {
		while(true) {
		//	System.out.println("Hi");
			try {
				Thread.sleep(5000);	// 5sec
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			autoSave();
		}
	}

	private void autoSave() {
		System.out.println("AutoSave");
	}
}

public class ThreadTest6{
	public static void main(String[] args) {

		// 1. NEW
		Thread thread = new Thread(new SaveRunnable(), "SaveRunnable-thread");
		
		// setDaemon
		thread.setDaemon(true);

		// 2. RUNNABLE
		thread.start();

		for(int i = 0 ; i < 100; i ++) {
			System.out.printf("%s: %d\n", Thread.currentThread().getName(), i);

			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}

			
		}
		System.out.printf("%s is dead\n", Thread.currentThread().getName());
	}
}