public class AccountTest5{
	public static void main(String[] args) {
		Account obj1 = new Account ("1", "일길동", "1111", "2017/01/01", 100000);
		Account obj2 = new Account ("2", "이길동", "2222", "2017/02/02", 200000);
		
		AccountTest5 ac5 = new AccountTest5();
		ac5.transferAccount(obj1, obj2, 5000);

		obj1.print();
		obj2.print();
	}

	public void transferAccount(Account _a, Account _b, int _money) {
		_a.withdraw(5000);
		_b.deposit(5000);
	}
}