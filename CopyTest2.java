public class CopyTest2{
	public static void main(String[] args) throws CloneNotSupportedException {
		Account account1 = new Account("1", "����", "1111", "2017/01/01", 1000);
		Account clone = account1.clone();

		clone.setPassword("10101010101");


		System.out.println(account1.toString());
		System.out.println(clone.toString());

		String a = "12345";
		String b = "123";

		System.out.println(a.length());

	}
}