public class ezez {
	public static void main(String[] args) {

		Account[] array = new Account[3];
		array[0] = new Account("1", "1�浿", "1111", "10170101", 100000);
		array[1] = new Account("2", "2�浿", "2222", "20270202", 200000);
		array[2] = new Account("3", "3�浿", "3333", "30370303", 300000);

		for(int i = 0; i < array.length; i++) {
			System.out.printf("%s\n", array[i].getAccountNumber());
		}

		print(array);

	} 
	public static void print(Account[] temp) {
		for(Account a: temp) {
			System.out.printf("%s\n", a.getAccountNumber());
		}
	}
	
}