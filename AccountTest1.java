/*	Obj: 
	
*/

//import, Package

public class AccountTest1{
	// class variable  (static variable)


	// instance Variable


	// main method
	public static void main(String[] args) {
		//System.out.printf("ÀºÇà: %s\n", Account.bankName);
		//Account.bankName = "½ÅÇÑÀºÇà";
		//System.out.printf("ÀºÇà: %s\n", Account.bankName);


		//Account(String _accountNumber, String _name, String _password, String _initday, int _balance)
		Account account1 = new Account("1", "±è±è±è", "1111", "2017/01/01", 1000);
		Account account2 = new Account("2", "µÑµÑµÑ", "2222", "2017/02/02", 2000);

		// 1. °èÁÂ¹øÈ£°¡ 1ÀÎ °í°´°èÁÂÀÇ ÀÜ°í¸¦ Á¶È¸.
		System.out.printf("account1 ÀÜ°í: %,d¿ø\n", account1.getBalance());

		account1.deposit(500000000);	// 1000¿ø ÀÔ±İ
		System.out.printf("ÃÑ ÀÜ°í: %,d¿ø\n", Account.totalBalance);
		
		System.out.printf("account1 ÀÜ°í: %,d¿ø\n", account1.getBalance()); // ÀÜ°íÁ¶È¸

		account1.withdraw(100000000);	// Ãâ±İ

		System.out.printf("account1 ÀÜ°í: %,d¿ø\n", account1.getBalance()); // ÀÜ°íÁ¶È¸
		System.out.printf("account2 ÀÜ°í: %,d¿ø\n", account2.getBalance());

		account1.transfer(account2, 1500000);		// °èÁÂÀÌÃ¼.

		System.out.printf("account1 ÀÜ°í: %,d¿ø\n", account1.getBalance());
		System.out.printf("account2 ÀÜ°í: %,d¿ø\n", account2.getBalance());

		System.out.printf("ÃÑ ÀÜ°í: %,d¿ø\n", Account.totalBalance);
		
		TestClass tc = new TestClass();
		System.out.println(tc.testA);

	}
}