public class StringTest1{
	// main method
	public static void main(String[] args) {
		String str = "Hi, java";
		int size = str.length();
		System.out.printf("%s�� ����: %d\n", str, size);

		// 0��° �ε����� �ش��ϴ� ���ڸ� ���ϴ�.
		System.out.printf("%s�� 0��° �ε����� ����: %c\n", str, str.charAt(0));

		// "Hi" ��� ���ڿ��� �����غ���

		System.out.printf("%s\n", str.substring(0,2));
	}
}