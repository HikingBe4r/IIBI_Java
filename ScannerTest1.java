// Scanner�� ���� �Է¹޴� ����

import java.util.Scanner;

public class ScannerTest1{

	// main method
	public static void main(String[] args) {
		
		// initialize variable
		Scanner scan = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���. ");
		int score = scan.nextInt();

		System.out.printf("�Է��� ������ %d���Դϴ�.%n", score);

	}
}
