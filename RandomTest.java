import java.lang.Math;
import java.util.Random;

public class RandomTest{
	public static void main(String[] args) {		
		/*
		for ( int i = 0 ; i < 10; i++ ) {
			System.out.printf("%d��°: %f\n", i+1, Math.random());
		}

		// 1~ 10������ ����
		for (int i = 0; i < 10; i++) {
			int result = (int) (Math.random()*51 +50);
			System.out.printf("%d��°: %d\n", i+1, result);
		}
		
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int a = r.nextInt();	// -21��~21��
			System.out.printf("%d��°: %d\n", i+1, a);
		}
		
		
		int a = r.nextInt(6) +5;	// 5<= a <11 
		System.out.println(a);
		*/

		// ������ 100�� ���� �ո��� ���� Ƚ���� �޸��� ���� Ƚ���� ����ϴ� ���α׷�.
		// Random class �̿�
		int head=0, tale=0;
		int count = 100;
	
		Random r = new Random();


		for(int i =0; i < count; i++) {
			boolean a = r.nextBoolean();

			if(a) {
				// �ո�
				head++;
			} else {
				// �޸�
				tale++;
			}
		}

		System.out.printf("��: %d, ��: %d\n", head, tale);

		
		
		
	}
}