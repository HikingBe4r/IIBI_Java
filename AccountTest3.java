/*	Obj: private�� ����� ������ ����.
	
*/

//import, Package

public class AccountTest3{
	// main method
	public static void main(String[] args) {
		// ���°�ü ���� �� ����
		Account obj1 = new Account("1", "������", "1111", "2017/01/01", 1000);

		//System.out.printf("���¹�ȣ: %s\n", obj1.accountNumber);	// error. private access
		System.out.printf("���¹�ȣ: %s\n", obj1.getAccountNumber());	// error. private access
		
		// 1. 5õ�� �Ա�
		obj1.deposit(5000);

		// 2. �ܰ���ȸ
		System.out.printf("�ܾ�: %,d\n", obj1.getBalance());

		// 3. ��� ��������.
	}
}