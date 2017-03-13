//import, Package

public class AccountTest4{

	// main method
	public static void main(String[] args) {
		Account obj1 = new Account ("1", "일길동", "1111", "2017/01/01", 1000);

		// 1. 계좌에서 1000원 인출.

		obj1.withdraw(5000);

		// 2. 잔고 조회

		System.out.printf("잔고: %,d원\n", obj1.getBalance());


	}
}