//������. 1. ���������
//%[argument_index$][flags][width][.precision]conversion

public class Operator1 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 5;
		int result;
		
		result = num1+num2;
		System.out.printf("%d + %d = %d%n", num1, num2, result);
		result = num1-num2;
		System.out.printf("%d - %d = %d%n", num1, num2, result);
		result = num1*num2;
		System.out.printf("%d * %d = %d%n", num1, num2, result);
		result = num1/num2;
		System.out.printf("%d / %d = %d%n", num1, num2, result);
		result = num1%num2;
		System.out.printf("%d %% %d = %d%n", num1, num2, result);

		System.out.printf("==========================================%n");

		System.out.printf("%d + %d = %d%n", num1, num2, num1+num2);
		System.out.printf("%d - %d = %d%n", num1, num2, num1-num2);
		System.out.printf("%d * %d = %d%n", num1, num2, num1*num2);
		System.out.printf("%d / %d = %d%n", num1, num2, num1/num2);
		System.out.printf("%d %% %d = %d%n", num1, num2, num1%num2);
	}
}