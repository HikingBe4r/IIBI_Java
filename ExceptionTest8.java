
public class ExceptionTest8{
	public static void main(String[] args) {
		Account account = null;
		Account account2 = null;
		try {
			account = new Account("1", "�ϱ浿", "1111", "2017.01.01", 10000);
			account2 = new Account("2", "�̱浿", "2222", "2017.02.02", 20000);

			System.out.println(account.getBalance());
			account.deposit(10);
			System.out.println(account.getBalance());
			account.withdraw(5000);

			account.transferAccount(account2, 50000);

			System.out.println(account.getBalance());
		} catch(WrongValueException wve) {
			wve.printStackTrace();	// �ݾ��� ����
		} catch(ExceedBalanceException ebe) {
			ebe.printStackTrace();	// �ܰ��� ����
		}

	}

}