
public class ThreadTest2 {
	public static void main(String[] args) {
		// Enum Thread.State

		// 1. NEW
		NumberThread thread1 = new NumberThread();
		//AlphabetThread thread2 = new AlphabetThread(new AlphabetRunnable(), "alphabet-thread");
		Thread thread2 = new Thread(new AlphabetRunnable(), "alphabet-thread");

		System.out.println("�ѹ������� �켱����: " + thread1.getPriority());
		System.out.println("���ĺ������� �켱����: " + thread2.getPriority());
		System.out.println("���ξ����� �켱����: " + new Thread().currentThread().getPriority());

		// 2. RUNNABLE
		thread1.start();
		thread2.start();

		System.out.println("���������尡 ����ƽ��ϴ�.  " + new Thread().currentThread().getName());

	}
}