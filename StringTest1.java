public class StringTest1{
	// main method
	public static void main(String[] args) {
		String str = "Hi, java";
		int size = str.length();
		System.out.printf("%s의 길이: %d\n", str, size);

		// 0번째 인덱스에 해당하는 문자를 구하다.
		System.out.printf("%s의 0번째 인덱스의 문자: %c\n", str, str.charAt(0));

		// "Hi" 라는 문자열만 추출해봐라

		System.out.printf("%s\n", str.substring(0,2));
	}
}