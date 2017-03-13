public class StringTest2 {
	public static void main(String[] args) {
		String str = "Hi, java";

		System.out.printf("%s\n", str.substring(4));

		String subject = "java-oracle-jsp-spring-android";

//		String[] a = str.split("-");

		// - 구분자를 이용해 문자열을 분리, 출력하시오.
		//	String[]	split(String regex)
		for (String a: subject.split("-")) {
			System.out.printf("%s\n", a);
		}
		

		// 정수형 데이터를 문자열 데이터로 변경하시오. (valueOf)

		int num = 10;
		System.out.printf("%d: %s\n", num, String.valueOf(num));
		System.out.println(String.valueOf(num)+ 5);
		
	}
}