public class ExceptionTest3{

	public static int divide(int num1, int num2) throws ArithmeticException {
		int result = num1/ num2;
		return result;
	}

	public static void main(String[] args) {
		
		try {
			int result = divide(10, 0);			
			System.out.printf("result: %d\n", result);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("End");
	}
}