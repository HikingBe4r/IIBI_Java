/*	Obj: 
	
*/

//import, Package

public class AccountTest1{
	// class variable  (static variable)


	// instance Variable


	// main method
	public static void main(String[] args) {
		//System.out.printf("����: %s\n", Account.bankName);
		//Account.bankName = "��������";
		//System.out.printf("����: %s\n", Account.bankName);


		//Account(String _accountNumber, String _name, String _password, String _initday, int _balance)
		Account account1 = new Account("1", "����", "1111", "2017/01/01", 1000);
		Account account2 = new Account("2", "�ѵѵ�", "2222", "2017/02/02", 2000);

		// 1. ���¹�ȣ�� 1�� �������� �ܰ� ��ȸ.
		System.out.printf("account1 �ܰ�: %,d��\n", account1.getBalance());

		account1.deposit(500000000);	// 1000�� �Ա�
		System.out.printf("�� �ܰ�: %,d��\n", Account.totalBalance);
		
		System.out.printf("account1 �ܰ�: %,d��\n", account1.getBalance()); // �ܰ���ȸ

		account1.withdraw(100000000);	// ���

		System.out.printf("account1 �ܰ�: %,d��\n", account1.getBalance()); // �ܰ���ȸ
		System.out.printf("account2 �ܰ�: %,d��\n", account2.getBalance());

		account1.transfer(account2, 1500000);		// ������ü.

		System.out.printf("account1 �ܰ�: %,d��\n", account1.getBalance());
		System.out.printf("account2 �ܰ�: %,d��\n", account2.getBalance());

		System.out.printf("�� �ܰ�: %,d��\n", Account.totalBalance);
		
		TestClass tc = new TestClass();
		System.out.println(tc.testA);

	}
}