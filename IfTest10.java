public class IfTest10{

	// main method
	public static void main(String[] args) {
		
		// initialize variable
		int score = 111188;

		if(score >= 0 && score <= 100) {
			if(score >= 90) {
				System.out.println("A����");
			} else if (score >= 80) {
				System.out.println("B����");
			} else if (score >= 70) {
				System.out.println("C����");
			} else if (score >= 60) {
				System.out.println("D����");
			} else {
				System.out.println("F����");
			} 
		} else {
			System.out.println("������ �ٽ� �Է��ϼ���.");
		}

	}
}