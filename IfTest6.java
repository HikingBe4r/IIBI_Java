// �Է��� ������ ¦���� Ȧ���� �Ǵ��ϴ� ��������if��
import java.util.Scanner;

public class IfTest6{

	// main method
	public static void main(String[] args) {
		
		// initialize variable
		int num;
		Scanner scan = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ���. ");
		num = scan.nextInt();

		if(num % 2 == 0) {
			System.out.println(num+"��(��) ¦���Դϴ�.");
		} else {
			System.out.println(num+"��(��) Ȧ���Դϴ�.");
		}


	}
}
