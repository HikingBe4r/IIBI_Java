// ������ ������ Ÿ�� ����
public class DataType11 {
	public static void main(String[] args) {
		//���� ���� �� �ʱ�ȭ
		char c1 = '0';		
		char c2 = 48;		// �ƽ�Ű�ڵ�
		char c3 = '\u0030';	// �����ڵ�
		
		System.out.println(Integer.toString(c1));
		System.out.println(Integer.toHexString(c1));
		System.out.printf("c1: %c, c2: %c, c3: %c%n", c1, c2, c3);
	}
}