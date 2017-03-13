public class ReferenceTest1 {
	// 인스턴스변수.

	// 생성자

	// 인스턴스메소드
	public String[] makeArray() {
		String[] names = {"일길동", "이길동", "삼길동"};
		return names;
	}

	// main method
	public static void main(String[] args) {
		ReferenceTest1 rf1 = new ReferenceTest1();

		for(String str: rf1.makeArray()) {
			System.out.printf("%s\n", str);
		}
	}


}