// 구구단 n단. ex) n * 1 = n ... 키보드로 입력.

import java.util.Scanner;

public class ForTest4{

	// main method
	public static void main(String[] args) {
		
		// initialize variable
		Scanner scan = new Scanner(System.in);
		int dan;
		
		System.out.printf("단 수를 입력하세요. ");
		dan = scan.nextInt();

		for(int i = 1 ; i < 10; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan*i);
		}

	}
}
