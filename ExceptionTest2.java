
public class ExceptionTest2{
	// main method
	public static void main(String[] args) {
		//Account account = new Account("1", "일길동", "1111", "2017.01.01", 1000);
		Account account = null;

		try {
			int balance = account.getBalance();	// NullPointerException
			System.out.printf("%,d원\n", balance);
		} catch(Object e) {
			e.printStackTrace();
		}

		System.out.println("END!!");
	}
}