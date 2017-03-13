import java.lang.Math;
import java.util.Random;

public class RandomTest{
	public static void main(String[] args) {		
		/*
		for ( int i = 0 ; i < 10; i++ ) {
			System.out.printf("%d번째: %f\n", i+1, Math.random());
		}

		// 1~ 10사이의 난수
		for (int i = 0; i < 10; i++) {
			int result = (int) (Math.random()*51 +50);
			System.out.printf("%d번째: %d\n", i+1, result);
		}
		
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int a = r.nextInt();	// -21억~21억
			System.out.printf("%d번째: %d\n", i+1, a);
		}
		
		
		int a = r.nextInt(6) +5;	// 5<= a <11 
		System.out.println(a);
		*/

		// 동전을 100번 던져 앞면이 나온 횟수와 뒷면이 나온 횟수를 출력하는 프로그램.
		// Random class 이용
		int head=0, tale=0;
		int count = 100;
	
		Random r = new Random();


		for(int i =0; i < count; i++) {
			boolean a = r.nextBoolean();

			if(a) {
				// 앞면
				head++;
			} else {
				// 뒷면
				tale++;
			}
		}

		System.out.printf("앞: %d, 뒤: %d\n", head, tale);

		
		
		
	}
}