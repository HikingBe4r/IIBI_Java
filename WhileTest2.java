/*	Obj: �̸��� �Է¹ް�, Quit�� �Է¹��� �� ���� while�� ������
*/

//import, Package
import java.util.Scanner;

public class WhileTest2{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		Scanner scan = new Scanner(System.in);

		// A1.
		String name = "";
		while(!name.equals("quit")) {	// name != "quit" �� �߸��� �ڵ�.
			System.out.print("a1. �̸��� �Է��ϼ���[����:quit] ");
			name = scan.nextLine();
			
			if(name.equals("quit")) {
				System.out.printf("a1. ���α׷��� �����մϴ�.%n", name);
			}
			else {
				System.out.printf("a1. �̸��� %s�Դϴ�.%n", name);
			}
		}

		// At.
		System.out.print("at. �̸��� �Է��ϼ���[����:quit] ");
		String name2 = scan.nextLine();
		while(!name2.equals("quit")) {	// name != "quit" �� �߸��� �ڵ�.
			System.out.printf("at. �̸��� %s�Դϴ�.%n", name2);
			System.out.print("at. �̸��� �Է��ϼ���[����:quit] ");
			name2 = scan.nextLine();
			
		}

		


	}
}