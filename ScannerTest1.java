// Scanner를 통해 입력받는 예제

import java.util.Scanner;

public class ScannerTest1{

	// main method
	public static void main(String[] args) {
		
		// initialize variable
		Scanner scan = new Scanner(System.in);

		System.out.print("점수를 입력하세요. ");
		int score = scan.nextInt();

		System.out.printf("입력한 점수는 %d점입니다.%n", score);

	}
}
