import java.util.Scanner;

public class IfTest3{

	// main method
	public static void main(String[] args) {
		
		// initialize variable
		int score;
		Scanner scan = new Scanner(System.in);

		System.out.print("점수를 입력하세요. ");
		score = scan.nextInt();

		if(!(score >= 0 && score <= 100)) { // score < 0 || score > 100
			System.out.printf("0~100사이의 점수를 입력하세요%n");	// 0 <= score <= 100
			return;	// 프로그램 종료
		}
		System.out.printf("점수는 %d점 입니다.%n", score);
	}
}
