//import, Package

public class AccountTest2{
	public int total (int a, int b) {
		return a+b;
	}

	public static int sTotal (int a, int b) {
		return a+b;
	}

	// main method
	public static void main(String[] args) {
		
		int a = 1, b = 2;

		//System.out.println(total(a,b)); //error

		// �ذ��� 2����
		// 1. ��ü�� �����.	--> instance method
		// 2. static method�� �����Ѵ�.	-> class method

		// 1. instance method total()
		AccountTest2 at2 = new AccountTest2();
		System.out.println(at2.total(a,b));

		// 2. static method sTotal()
		System.out.println(sTotal(a,b));


	}
}