public class IfTest11{

	// main method
	public static void main(String[] args) {
		
		// initialize variable
		int age = 1;

		if(age >= 10) {
			if(age <20) {
				System.out.println("10��");
			} else if (age < 30) {
				System.out.println("20��");
			} else if (age < 40) {
				System.out.println("30��");
			} else if (age < 50) {
				System.out.println("40��");
			} else if (age < 60) {
				System.out.println("50��");
			} else {
				System.out.println("���.");
			}
		} else {
			System.out.println("���̸� �ٽ� �Է����ּ���. (10�� �̻�)");
		}
	}
}
