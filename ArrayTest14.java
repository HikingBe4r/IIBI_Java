public class ArrayTest14 {
	public static void main(String[] args) {
		Account[] array = new Account[3];
		array[0] = new Account("1", "����ü1ȣ", "1111", "1017", 10000);
		array[1] = new Account("2", "����ü2ȣ", "2222", "2017", 20000);
		array[2] = new Account("3", "����ü3ȣ", "3333", "3017", 30000);

		print(array);
	}

	public static void print(Account[] _arr) {
		// �ܰ��� ���
		for(Account i: _arr) {
			System.out.printf("�ܰ�: %d\n", i.getBalance());
		}
	}
}