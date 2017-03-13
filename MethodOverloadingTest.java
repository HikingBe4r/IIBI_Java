/*	Obj: 메소드 오버로딩 (Method Overloading) 테스트
		(메소드 중첩)
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

	// 두개의 정수의 합
	public static int total (int num1, int num2) {
		return num1+num2;	
	}

	// 세개의 정수의 합.
	public static int total (int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	// 두 실수의 합
	public static double total (double num1, double num2) {
		return num1+num2;
	}
}