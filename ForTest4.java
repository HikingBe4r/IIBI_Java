// ������ n��. ex) n * 1 = n ... Ű����� �Է�.

import java.util.Scanner;

public class ForTest4{

	// main method
	public static void main(String[] args) {
		
		// initialize variable
		Scanner scan = new Scanner(System.in);
		int dan;
		
		System.out.printf("�� ���� �Է��ϼ���. ");
		dan = scan.nextInt();

		for(int i = 1 ; i < 10; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan*i);
		}

	}
}
