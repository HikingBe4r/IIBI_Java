public class StringTest2 {
	public static void main(String[] args) {
		String str = "Hi, java";

		System.out.printf("%s\n", str.substring(4));

		String subject = "java-oracle-jsp-spring-android";

//		String[] a = str.split("-");

		// - �����ڸ� �̿��� ���ڿ��� �и�, ����Ͻÿ�.
		//	String[]	split(String regex)
		for (String a: subject.split("-")) {
			System.out.printf("%s\n", a);
		}
		

		// ������ �����͸� ���ڿ� �����ͷ� �����Ͻÿ�. (valueOf)

		int num = 10;
		System.out.printf("%d: %s\n", num, String.valueOf(num));
		System.out.println(String.valueOf(num)+ 5);
		
	}
}