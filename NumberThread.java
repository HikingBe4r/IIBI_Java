// 1~100까지 정수를 콘솔에 출력하는 작업
// 영문 대문자를 콘솔에 출력하는 작업

public class NumberThread extends Thread{
	
	public NumberThread() {
		super(new NumberRunnable(), "number-thread");
	}

	//method overriding
	//public void run() {
		/*
		for(int i = 1; i <= 50; i++) {
			System.out.printf("쓰레드이름: %s, 번호: %d\n", getName(), i);

			try {
				sleep(100);	// 1초 (1000 밀리초)
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("다음쓰레드가 종료됐습니다.  " + new Thread().currentThread().getName());	
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