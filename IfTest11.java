public class IfTest11{

	// main method
	public static void main(String[] args) {
		
		// initialize variable
		int age = 1;

		if(age >= 10) {
			if(age <20) {
				System.out.println("10대");
			} else if (age < 30) {
				System.out.println("20대");
			} else if (age < 40) {
				System.out.println("30대");
			} else if (age < 50) {
				System.out.println("40대");
			} else if (age < 60) {
				System.out.println("50대");
			} else {
				System.out.println("어르신.");
			}
		} else {
			System.out.println("나이를 다시 입력해주세요. (10살 이상)");
		}
	}
}
