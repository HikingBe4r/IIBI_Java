/*	Obj: 이름을 입력받고, Quit을 입력받을 때 까지 while문 돌리기
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
		while(!name.equals("quit")) {	// name != "quit" 은 잘못된 코딩.
			System.out.print("a1. 이름을 입력하세요[종료:quit] ");
			name = scan.nextLine();
			
			if(name.equals("quit")) {
				System.out.printf("a1. 프로그램을 종료합니다.%n", name);
			}
			else {
				System.out.printf("a1. 이름은 %s입니다.%n", name);
			}
		}

		// At.
		System.out.print("at. 이름을 입력하세요[종료:quit] ");
		String name2 = scan.nextLine();
		while(!name2.equals("quit")) {	// name != "quit" 은 잘못된 코딩.
			System.out.printf("at. 이름은 %s입니다.%n", name2);
			System.out.print("at. 이름을 입력하세요[종료:quit] ");
			name2 = scan.nextLine();
			
		}

		


	}
}
