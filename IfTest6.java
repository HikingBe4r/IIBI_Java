// 입력한 정수가 짝수냐 홀수냐 판단하는 양자택일if문
import java.util.Scanner;

public class IfTest6{

	// main method
	public static void main(String[] args) {
		
		// initialize variable
		int num;
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자를 입력하세요. ");
		num = scan.nextInt();

		if(num % 2 == 0) {
			System.out.println(num+"은(는) 짝수입니다.");
		} else {
			System.out.println(num+"은(는) 홀수입니다.");
		}


	}
}
