public class NumberRunnable implements Runnable {
	public void run() {
		for(int i = 1; i <= 50; i++) {
			System.out.printf("���ʺ� �������̸�: %s, ��ȣ: %d\n", Thread.currentThread().getName(), i);
			try {
				Thread.currentThread().sleep(100);	// 1�� (1000 �и���)
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("���� ���ʺ������尡 ����ƽ��ϴ�.  " + Thread.currentThread().getName());	
	}
}

class AlphabetRunnable implements Runnable {
	public void run() {
		for(int i = 0; i <26; i++) {
			System.out.printf("�������̸�: %s, ���ĺ�: %c\n", Thread.currentThread().getName(), 'A'+i);
			try {
				Thread.currentThread().sleep(100);	// 1�� (1000 �и���)
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("���������尡 ����ƽ��ϴ�.  " + Thread.currentThread().getName());
	}
}