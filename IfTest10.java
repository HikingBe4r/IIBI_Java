public class IfTest10{

	// main method
	public static void main(String[] args) {
		
		// initialize variable
		int score = 111188;

		if(score >= 0 && score <= 100) {
			if(score >= 90) {
				System.out.println("A학점");
			} else if (score >= 80) {
				System.out.println("B학점");
			} else if (score >= 70) {
				System.out.println("C학점");
			} else if (score >= 60) {
				System.out.println("D학점");
			} else {
				System.out.println("F학점");
			} 
		} else {
			System.out.println("점수를 다시 입력하세요.");
		}

	}
}
