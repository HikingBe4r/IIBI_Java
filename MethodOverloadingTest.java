/*	Obj: �޼ҵ� �����ε� (Method Overloading) �׽�Ʈ
		(�޼ҵ� ��ø)
*/

//import, Package

public class MethodOverloadingTest {
	// class variable  (static variable)

	// instance Variable

	// main method
	public static void main(String[] args) {
		System.out.printf("%.2f\n", total(1.5, 2.3));
		System.out.printf("%d\n", total(1, 2));
		System.out.printf("%d\n", total(1, 2, 3));
	}

	// �ΰ��� ������ ��
	public static int total (int num1, int num2) {
		return num1+num2;	
	}

	// ������ ������ ��.
	public static int total (int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	// �� �Ǽ��� ��
	public static double total (double num1, double num2) {
		return num1+num2;
	}
}