/*	Obj: �ֹε�Ϲ�ȣ �޹�ȣ 1, 3�̸� ����, 2, 4�� �����Դϴ� ���.
	
*/

//import, Package

public class Sub2{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		int[] num = {7,9,0,6,0,8,'-',2,5,5,2,4,1,6};	// �ֹε�Ϲ�ȣ
		
		for(int i = 0; i < num.length; i++) {
			if(i==6) {
				System.out.printf("-");
			} else {
				System.out.printf("%d", num[i]);
			}
		}
		
		
		if(num[7] == 1 || num[7] == 3) {
			//����
			System.out.println("�����Դϴ�.");
		} else if(num[7] == 2 || num[7] == 4) {
			//����
			System.out.println("�����Դϴ�.");
		} else {
			//�߸��� �ֹε�Ϲ�ȣ.
			System.out.println("�߸��� ��ȣ�Դϴ�.");
			
		}

	}
}
