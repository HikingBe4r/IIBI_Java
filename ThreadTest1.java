
public class ThreadTest1{
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();		// ���� �������� ������ ��ȯ

		System.out.printf("%s Thread is running\n", thread.getName());

		System.out.println("Hello");
		System.out.println("Thread");
		
		System.out.printf("%s Thread is dead\n", thread.getName());
	}
}