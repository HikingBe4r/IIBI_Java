/*	Obj: 은행 입출금 관리시스템 개발
	
*/
public class Account implements Cloneable{

	// class Variable
	private static String bankName;
	private static long totalBalance = 0;	// 은행의 총 잔고.

	// static 초기화 블록
	static {
		bankName = "우리은행";
		//totalBalance = 0;
		//System.out.println("static 초기화 블록");
	}

	// instance Variable
	 String accountNumber;	// 계좌번호
	 String name;			// 이름
	 String password;		// 비밀번호
	 String initday;		// 계좌 개설일자
	 int balance;			// 잔고
	
	

	// default constructor
	public Account() {}
	
	// parameter constructor
	public Account(String _accountNumber, String _name, String _password,
				String _initday, int _balance) {//throws WrongValueException{
		/*
		if(_balance <= 0) {
			throw new WrongValueException("금액을 정확히 입력하세요.");
		}*/

		this.accountNumber = _accountNumber;
		this.name = _name;
		this.password = _password;
		this.initday = _initday;
		this.balance = _balance;
		Account.totalBalance += _balance;
	}

	// Instance Method
	
	// 계좌번호 조회
	public String getAccountNumber() {
		return this.accountNumber;
	}

	// 잔액조회
	public int getBalance() {
		return this.balance;
	}

	// 입금
	public void deposit(int _money) throws WrongValueException {

		if(_money <= 0) {
			throw new WrongValueException("금액을 정확히 입력하세요.");
		}
		balance += _money;
		Account.totalBalance += _money;
	}

	// 출금
	public void withdraw(int _money) throws WrongValueException, ExceedBalanceException{

		if(_money <= 0) {
			throw new WrongValueException("금액을 정확히 입력하세요.");
		}

		if(this.balance < _money) {
			throw new ExceedBalanceException("남은 잔고가 부족합니다.");
		}
		this.balance -= _money;
		Account.totalBalance -= _money;
	}
	
	// 계좌이체
	public void transferAccount(Account _account, int _money) throws WrongValueException, ExceedBalanceException{
			this.withdraw(_money);
			_account.deposit(_money);
	}
	

	// Class Method
	public static String getBankName() {
		return bankName;
	}


	public void print() {
		System.out.printf("0번의 잔고: %,d\n", this.getBalance());
	}
	
	// method overriding
	public String toString() {
		return "accountNumber: " + accountNumber +
			", name: " + name +
			", password: " + password+
			", initday: "+ initday +
			", balance: "+ balance;
	}
	// 계좌번호, 이름, 비밀번호 등등 다 같으면 true / false
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