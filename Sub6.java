/*	Obj: 
	
*/

//import, Package
import java.util.Scanner;

public class Sub6{
	// Global variable

	// main method
	public static void main(String[] args) {
		
		// Local variable
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();

		 if(year%4 ==0 && year%100 != 0) {
			// ����
			System.out.println("�����Դϴ�.");

		} else if(year%400 == 0) {
			// ����
			System.out.println("�����Դϴ�.");

		}else {
			//���
			System.out.println("����Դϴ�.");
		}

	}
}
