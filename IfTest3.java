import java.util.Scanner;

public class IfTest3{

	// main method
	public static void main(String[] args) {
		
		// initialize variable
		int score;
		Scanner scan = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���. ");
		score = scan.nextInt();

		if(!(score >= 0 && score <= 100)) { // score < 0 || score > 100
			System.out.printf("0~100������ ������ �Է��ϼ���%n");	// 0 <= score <= 100
			return;	// ���α׷� ����
		}
		System.out.printf("������ %d�� �Դϴ�.%n", score);
	}
}