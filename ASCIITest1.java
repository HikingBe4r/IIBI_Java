// ������ ������ Ÿ�� ����
public class ASCIITest1 {
	public static void main(String[] args) {
		//���� ���� �� �ʱ�ȭ

		/*
		System.out.println("===========ASCII CODE==============");
		
		for(int i = 0; i < 128; i++) {
			System.out.printf("%d: %c	", i, i);
			if( i % 5 == 4)
				System.out.println("");
		}
		*/

		int num = 97;	
		
		System.out.println(Integer.toBinaryString(num));	// 2���� ��¹��. 16����: Integer.toHexString(����)
		System.out.printf("ASCII: %c%n", num);

		char c1 = '\u0061';
		System.out.printf("UniCode: %c%n", c1);


	}
}