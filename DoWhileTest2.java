/*	Obj: �̸��� ��� �Է¹޴ٰ� quit�� �Է¹����� �����ϴ� �ݺ���
			do while�� ����Ŷ�.
	
*/

//import, Package

import java.util.Scanner;

public class DoWhileTest2{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		Scanner scan = new Scanner(System.in);
		String input;

		do {
			System.out.println("�̸��� �Է��ϼ���. [����: quit]");

			input = scan.nextLine();
			
			if(input.equals("quit")) {
				System.out.println("quit�� �Է��ϼ̽��ϴ�.");
				break;
			}

			System.out.printf("�̸��� %s�Դϴ�.%n", input);
			
		
		} while(true);
		


	}
}