/*	Obj: ���������ڿ� ���� ����
	
*/
public class AccessModifierTest1 {
	public static void main(String[] args) {
		// �ڵ��� ��ü ���� �� ����
		Car car1 = new Car("K5", "���", "����", "���");

		// �ڵ����� ��ȸ
		System.out.printf("�ڵ�����: %s\n", car1.getName());	// private String name
		
		
	}
}