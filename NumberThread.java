// 1~100���� ������ �ֿܼ� ����ϴ� �۾�
// ���� �빮�ڸ� �ֿܼ� ����ϴ� �۾�

public class NumberThread extends Thread{
	
	public NumberThread() {
		super(new NumberRunnable(), "number-thread");
	}

	//method overriding
	//public void run() {
		/*
		for(int i = 1; i <= 50; i++) {
			System.out.printf("�������̸�: %s, ��ȣ: %d\n", getName(), i);

			try {
				sleep(100);	// 1�� (1000 �и���)
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("���������尡 ����ƽ��ϴ�.  " + new Thread().currentThread().getName());	
		*/
		//NumberRunnable nr = new NumberRunnable();
		//nr.run();
	//}
	
}

class AlphabetThread extends Thread {
	public AlphabetThread() {
		super("Alphabet-thread");
	}
/*
	public void run() {
		AlphabetRunnable ar = new AlphabetRunnable();
		ar.run();
	}*/
}