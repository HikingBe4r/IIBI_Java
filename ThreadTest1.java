
public class ThreadTest1{
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();		// 현재 실행중인 스레드 반환

		System.out.printf("%s Thread is running\n", thread.getName());

		System.out.println("Hello");
		System.out.println("Thread");
		
		System.out.printf("%s Thread is dead\n", thread.getName());
	}
}