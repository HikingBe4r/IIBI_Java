//import, Package

public class AccountTest4{

	// main method
	public static void main(String[] args) {
		Account obj1 = new Account ("1", "�ϱ浿", "1111", "2017/01/01", 1000);

		// 1. ���¿��� 1000�� ����.

		obj1.withdraw(5000);

		// 2. �ܰ� ��ȸ

		System.out.printf("�ܰ�: %,d��\n", obj1.getBalance());


	}
}