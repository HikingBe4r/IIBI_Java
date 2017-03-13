/*	Obj: private로 선언된 변수를 관리.
	
*/

//import, Package

public class AccountTest3{
	// main method
	public static void main(String[] args) {
		// 계좌객체 선언 및 생성
		Account obj1 = new Account("1", "일일일", "1111", "2017/01/01", 1000);

		//System.out.printf("계좌번호: %s\n", obj1.accountNumber);	// error. private access
		System.out.printf("계좌번호: %s\n", obj1.getAccountNumber());	// error. private access
		
		// 1. 5천원 입금
		obj1.deposit(5000);

		// 2. 잔고조회
		System.out.printf("잔액: %,d\n", obj1.getBalance());

		// 3. 출금 예외조건.
	}
}