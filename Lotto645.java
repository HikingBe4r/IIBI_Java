// �ζ�. 3�� 5��, 4�� 4��, 5�� 3��, 5+���ʽ�1 2��, 6 1��
// Ű����� �Է¹��� ���� ��÷�� �ƴ��� Ȯ��.
// �ζ� ��÷��ȣ�� �������� ����

import java.util.*;

public class Lotto645{
	// main method
	public static void main(String[] args) {
		// �ζ� ��÷��ȣ ����
		int[] lotto = new int[7];	// 6 + ���ʽ�
		
		Random r = new Random();
		
		while(true) {
			for(int i = 0; i < lotto.length; i++) {
				lotto[i] = r.nextInt(45)+1;
			}
			
			// �ߺ���ȣ�� �߸� �ٽ� ��ȣ ����.
			int b = 0;

			for(int i = 0; i < lotto.length; i++) {
				for(int j =i+1; j <i; j++) {
					if(lotto[i] == lotto[j]) {
						b++;
					}
				}				
			}

			if(b == 0) break;
		}

			

		// ��÷��ȣ �������� ����

		for(int i =0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(lotto[i] < lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}

		System.out.printf("\t��÷��ȣ\t���ʽ�\n" );

		// �ζ� ��÷��ȣ ���
		for( int i = 0 ; i < lotto.length; i++) {
			if(i<6) {
				System.out.printf("%d  ", lotto[i]);
			}
			else
				System.out.printf("\t%d\n", lotto[i]);
		}
		
		// Ȯ���ϰ���� ��ȣ �Է�
		
		Scanner sc = new Scanner(System.in);
		int[] myNum = new int[6];
		int c = 0;	// �Է��� ��ȣ ����.
		
		while(true) {
			boolean well = false;	// true�϶��� �迭�� ���� �Է�.

			System.out.printf("%d��° ��ȣ: ",c+1);
			int a = sc.nextInt();

			// �Է¹��� ���� 1~45��������.
			if(a>=1 && a<=45) {
				well = true;

				for(int i = 0; i < myNum.length; i++) {
					if(a == myNum[i]) {
						System.out.println("�ߺ������Դϴ�. �ٽ� �Է��ϼ���.");
						well = false;
						break;
					}
				}
			} else {
				System.out.println("1~45������ ���ڸ� �Է��ϼ���.");
				continue;
			}

			if(well) {
				myNum[c] = a;
				c++;
			}

			if(c >= 6)
				break;
		}
		
		// �Է��� �� ���
		System.out.println("�Է��� ��ȣ");
		for( int i = 0 ; i < myNum.length; i++) {
			System.out.printf("%d  ", myNum[i]);
		}


		// ��÷Ȯ��
		int count = 0;
		boolean _2nd = false;

		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(myNum[i] == lotto[j]) {
					count++;
				}
			}
			if(myNum[i] == lotto[6]) {
				_2nd = true;
			}
		}
		
		System.out.printf("\n��÷���: ");
		if(count == 6) {
			System.out.println("1��");
		} else if(count == 5 && _2nd) {
			System.out.println("2��");
		} else if(count == 5) {
			System.out.println("3��");
		} else if(count == 4) {
			System.out.println("4��");
		} else if(count == 3) {
			System.out.println("5��");
		} else {
			System.out.println("��ο�");
		}

		
	}
}