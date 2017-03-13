/*	Obj: ���� ����� �����ý��� ����
	
*/
public class Account implements Cloneable{

	// class Variable
	private static String bankName;
	private static long totalBalance = 0;	// ������ �� �ܰ�.

	// static �ʱ�ȭ ���
	static {
		bankName = "�츮����";
		//totalBalance = 0;
		//System.out.println("static �ʱ�ȭ ���");
	}

	// instance Variable
	 String accountNumber;	// ���¹�ȣ
	 String name;			// �̸�
	 String password;		// ��й�ȣ
	 String initday;		// ���� ��������
	 int balance;			// �ܰ�
	
	

	// default constructor
	public Account() {}
	
	// parameter constructor
	public Account(String _accountNumber, String _name, String _password,
				String _initday, int _balance) {//throws WrongValueException{
		/*
		if(_balance <= 0) {
			throw new WrongValueException("�ݾ��� ��Ȯ�� �Է��ϼ���.");
		}*/

		this.accountNumber = _accountNumber;
		this.name = _name;
		this.password = _password;
		this.initday = _initday;
		this.balance = _balance;
		Account.totalBalance += _balance;
	}

	// Instance Method
	
	// ���¹�ȣ ��ȸ
	public String getAccountNumber() {
		return this.accountNumber;
	}

	// �ܾ���ȸ
	public int getBalance() {
		return this.balance;
	}

	// �Ա�
	public void deposit(int _money) throws WrongValueException {

		if(_money <= 0) {
			throw new WrongValueException("�ݾ��� ��Ȯ�� �Է��ϼ���.");
		}
		balance += _money;
		Account.totalBalance += _money;
	}

	// ���
	public void withdraw(int _money) throws WrongValueException, ExceedBalanceException{

		if(_money <= 0) {
			throw new WrongValueException("�ݾ��� ��Ȯ�� �Է��ϼ���.");
		}

		if(this.balance < _money) {
			throw new ExceedBalanceException("���� �ܰ� �����մϴ�.");
		}
		this.balance -= _money;
		Account.totalBalance -= _money;
	}
	
	// ������ü
	public void transferAccount(Account _account, int _money) throws WrongValueException, ExceedBalanceException{
			this.withdraw(_money);
			_account.deposit(_money);
	}
	

	// Class Method
	public static String getBankName() {
		return bankName;
	}


	public void print() {
		System.out.printf("0���� �ܰ�: %,d\n", this.getBalance());
	}
	
	// method overriding
	public String toString() {
		return "accountNumber: " + accountNumber +
			", name: " + name +
			", password: " + password+
			", initday: "+ initday +
			", balance: "+ balance;
	}
	// ���¹�ȣ, �̸�, ��й�ȣ ��� �� ������ true / false
	public boolean equals(Object obj) {
		if(!(obj instanceof Account)) {
			return false;
		}

		Account account = (Account) obj;
		if( this.accountNumber.equals(account.accountNumber) &&
			this.name.equals(account.name) &&
			this.password.equals(account.password) &&
			this.initday.equals(account.initday) &&
			this.balance == account.balance ) {
			return true;
		}
		return false;
	}

	public void setPassword(String _pw) {
		this.password = _pw;
	}

	protected Account clone() throws CloneNotSupportedException {
		return (Account)super.clone();
	}

}