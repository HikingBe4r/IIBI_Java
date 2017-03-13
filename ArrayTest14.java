public class ArrayTest14 {
	public static void main(String[] args) {
		Account[] array = new Account[3];
		array[0] = new Account("1", "실험체1호", "1111", "1017", 10000);
		array[1] = new Account("2", "실험체2호", "2222", "2017", 20000);
		array[2] = new Account("3", "실험체3호", "3333", "3017", 30000);

		print(array);
	}

	public static void print(Account[] _arr) {
		// 잔고를 출력
		for(Account i: _arr) {
			System.out.printf("잔고: %d\n", i.getBalance());
		}
	}
}