public class NumberRunnable implements Runnable {
	public void run() {
		for(int i = 1; i <= 50; i++) {
			System.out.printf("러너블 쓰레드이름: %s, 번호: %d\n", Thread.currentThread().getName(), i);
			try {
				Thread.currentThread().sleep(100);	// 1초 (1000 밀리초)
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("다음 러너블쓰레드가 종료됐습니다.  " + Thread.currentThread().getName());	
	}
}

class AlphabetRunnable implements Runnable {
	public void run() {
		for(int i = 0; i <26; i++) {
			System.out.printf("쓰레드이름: %s, 알파벳: %c\n", Thread.currentThread().getName(), 'A'+i);
			try {
				Thread.currentThread().sleep(100);	// 1초 (1000 밀리초)
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("다음쓰레드가 종료됐습니다.  " + Thread.currentThread().getName());
	}
}